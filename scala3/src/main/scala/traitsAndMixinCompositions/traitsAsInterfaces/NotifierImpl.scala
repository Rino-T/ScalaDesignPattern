package traitsAndMixinCompositions.traitsAsInterfaces

class NotifierImpl(val notificationMessage: String) extends Notifier {
  override def clear(): Unit = println("cleared")
}
