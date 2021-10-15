class WorkflowFacade {
  private val flowOne = new FlowOne
  private val flowTwo = new FlowTwo
  private val flowThree = new FlowThree

  def run():Unit = {
    flowOne.get()
    flowTwo.run()
    flowThree.break()
  }
}

class FlowOne {
  def get(): Unit = {}
}

class FlowTwo {
  def run(): Unit = {}
}

class FlowThree {
  def break(): Unit =  {}
}