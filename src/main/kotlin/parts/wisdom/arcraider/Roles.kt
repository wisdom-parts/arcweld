package parts.wisdom.arcraider

import me.joypri.Role

object Width : Role<Int>()
object Height : Role<Int>()
object X : Role<Int>()
object Y : Role<Int>()
object TheColor : Role<Color>()
object Start : Role<Coords>()
object Length : Role<Int>()
object TheDirection : Role<Direction>()
object TheGrid : Role<Grid>()
object TheLine : Role<Line>()


// TODO: Replace this with the actual type.
typealias DavidsGrid = Array<Array<Color>>

enum class Color {
    NONE,
    BLACK,
    BLUE,
    RED,
    GREEN,
    YELLOW,
    GRAY,
    MAGENTA,
    ORANGE,
    CYAN,
    PINK
}

enum class Direction { UP, RIGHT }