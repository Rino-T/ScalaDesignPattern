package traitsAndMixinCompositions.traitsAsInterfaces

/**
 * `trait` は例えばJavaのような他の言語で言うところの、`interface` のようにみることができる。
 * しかし、`trait` はそれらのいくつかもしくは全てに実装付与することができる。
 *
 * [[Alarm]] は `interface` だ。[[Alarm.trigger trigger()]] メソッドのみをもち、実装を持たない。
 * ミックスインされたクラスは、その実装を要求される。
 */
trait Alarm {
  def trigger(): String
}
