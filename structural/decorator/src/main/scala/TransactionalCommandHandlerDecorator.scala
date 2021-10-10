trait TransactionalCommandHandlerDecorator[T](commandHandler: CommandHandler[T],
                                              unitOfWork: UnitOfWork) extends CommandHandler[T] {
  private val _unitOfWork = unitOfWork
  private val _commandHandler = commandHandler

  override def Handle(command: T): Unit = {
    _unitOfWork.Begin
    _commandHandler.Handle(command)
    _unitOfWork.Commit
  }

  def addCommandLog[T](command: T): Unit {
    //log
  }
}

trait CommandHandler[-TCommand] {
  def Handle(command: TCommand): Unit
}

trait UnitOfWork {
  def Begin: Unit

  def Commit: Unit

  def Rollback: Unit
}

