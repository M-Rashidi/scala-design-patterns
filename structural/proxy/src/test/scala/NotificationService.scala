trait NotificationService {
  def sendWelcome(username: String): Unit
}

// Real Subject
class ExpensiveNotificationService extends Nothing {
  final def SendWelcome(username: String): Unit = {
  }
}

class NotificationProxyService(notificationService: => NotificationService) extends NotificationService {
  private lazy val _notificationService = notificationService

  final def sendWelcome(username: String): Unit = {
    this._notificationService.sendWelcome(username)
  }
}


class RegisterService(var _notificationService: NotificationService) {
  final def RegisterUser(username: String): Unit = {
    // ....register user
    //  if (registrationWasSuccessful)
    this._notificationService.sendWelcome(username)
  }
}