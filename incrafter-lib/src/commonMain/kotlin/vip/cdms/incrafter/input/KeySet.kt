package vip.cdms.incrafter.input

import kotlin.jvm.JvmInline

@JvmInline
value class KeySet(val keys: Set<Key>) {
    constructor(vararg keys: Key) : this(keys.toSet())

    val isCtrlLeft get() = Key.CtrlLeft in keys
    val isCtrlRight get() = Key.CtrlRight in keys
    val isCtrl get() = isCtrlLeft || isCtrlRight
    val isAltLeft get() = Key.AltLeft in keys
    val isAltRight get() = Key.AltRight in keys
    val isAlt get() = isAltLeft || isAltRight
    val isShiftLeft get() = Key.ShiftLeft in keys
    val isShiftRight get() = Key.ShiftRight in keys
    val isShift get() = isShiftLeft || isShiftRight

    operator fun plus(other: KeySet) = KeySet(keys + other.keys)
    operator fun plus(other: Key) = KeySet(keys + other)
}

inline operator fun Key.plus(other: Key) = KeySet(this, other)
