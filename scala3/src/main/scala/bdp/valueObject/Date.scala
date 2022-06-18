package bdp.valueObject

/**
 * Scala の場合 value object デザインパターンは `case class` で達成できる
 */
case class Date(
    day: Int,
    month: String,
    year: Int
)
