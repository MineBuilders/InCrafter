package vip.cdms.incrafter.input

expect enum class Key {
    Esc,
    Del,
    Backtick,
    Minus,
    Equal,
    Backspace,
    Tab,
    BracketLeft,
    BracketRight,
    Backslash,
    Semicolon,
    SingleQuote,
    Enter,
    Comma,
    Period,
    Slash,
    Num1,
    Num2,
    Num3,
    Num4,
    Num5,
    Num6,
    Num7,
    Num8,
    Num9,
    Num0,
    NumPad1,
    NumPad2,
    NumPad3,
    NumPad4,
    NumPad5,
    NumPad6,
    NumPad7,
    NumPad8,
    NumPad9,
    NumPad0,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z,
    F1,
    F2,
    F3,
    F4,
    F5,
    F6,
    F7,
    F8,
    F9,
    F10,
    F11,
    F12,
    PageUp,
    PageDown,
    Space,
    ArrowUp,
    ArrowDown,
    ArrowLeft,
    ArrowRight,
    CtrlLeft,
    CtrlRight,
    AltLeft,
    AltRight,
    ShiftLeft,
    ShiftRight;

    companion object
}

inline val Key.Companion.Tilde get() = Key.ShiftLeft + Key.Backtick
inline val Key.Companion.Underscore get() = Key.ShiftRight + Key.Minus
inline val Key.Companion.Plus get() = Key.ShiftRight + Key.Equal
inline val Key.Companion.Bang get() = Key.ShiftLeft + Key.Num1
inline val Key.Companion.At get() = Key.ShiftLeft + Key.Num2
inline val Key.Companion.Hash get() = Key.ShiftLeft + Key.Num3
inline val Key.Companion.Dollar get() = Key.ShiftLeft + Key.Num4
inline val Key.Companion.Percent get() = Key.ShiftLeft + Key.Num5
inline val Key.Companion.Caret get() = Key.ShiftLeft + Key.Num6
inline val Key.Companion.Ampersand get() = Key.ShiftLeft + Key.Num7
inline val Key.Companion.Asterisk get() = Key.ShiftRight + Key.Num8
inline val Key.Companion.ParenthesisLeft get() = Key.ShiftRight + Key.Num9
inline val Key.Companion.ParenthesisRight get() = Key.ShiftRight + Key.Num0
inline val Key.Companion.BraceLeft get() = Key.ShiftRight + Key.BracketLeft
inline val Key.Companion.BraceRight get() = Key.ShiftRight + Key.BracketRight
inline val Key.Companion.Pipe  get() = Key.ShiftRight + Key.Backslash
inline val Key.Companion.Colon get() = Key.ShiftRight + Key.Semicolon
inline val Key.Companion.DoubleQuote get() = Key.ShiftRight + Key.SingleQuote
inline val Key.Companion.LessThan get() = Key.ShiftRight + Key.Comma
inline val Key.Companion.GreaterThan get() = Key.ShiftRight + Key.Period
inline val Key.Companion.Question get() = Key.ShiftRight + Key.Slash
