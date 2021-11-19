trait Command {}

trait CommandHandler[T] {
  def handle(command: T): Unit
}

trait CommandBus {
  def dispatch[T](command: T): Unit
}

class TransactionalCommandHandlerDecorator[T](var _handler: CommandHandler[T]) extends CommandHandler[T] {
  final def handle(command: T): Unit = {
    // begin transaction
    this._handler.handle(command)
    // commit transaction
  }
}

class SampleCommandBus extends CommandBus {
  private val _handlers: List[Any] = _handlers.::(new RegisterUserHandler)

  override final def dispatch[T](command: T): Unit = {
    val handlers = _handlers.map(_.asInstanceOf[CommandHandler[T]])

    for (handler <- handlers) {
      handler.handle(command)
    }
  }
}
  //.............
  case class RegisterUser(var username: String, var password: String) extends Command {

  }


  class RegisterUserHandler extends CommandHandler[RegisterUser] {
    final def handle(command: RegisterUser): Unit = {

    }
  }

