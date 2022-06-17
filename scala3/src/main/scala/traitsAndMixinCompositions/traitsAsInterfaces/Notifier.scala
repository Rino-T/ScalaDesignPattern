package traitsAndMixinCompositions.traitsAsInterfaces

trait Notifier {
  val notificationMessage: String

  def printNotification(): Unit = {
    println(notificationMessage)
  }

  def clear(): Unit
}
