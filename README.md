# 🍪 Cookie Clicker Android App

This project is a Cookie Clicker-style game developed in Android Studio using Java. It uses fragments, a bottom navigation bar, dynamic UI updates, and timers to simulate cookie generation over time.

---

## 📱 Features

- Bottom Navigation with fragments: Cookie, Store.
- Cookie counter that increases every second based on CPS (Cookies Per Second).
- Custom-styled buttons with text and icons.
- Clickable image triggers (e.g., cookie click = gain cookies).
- UI components such as `ImageView`, `TextView`, and `Button` dynamically updated via Java.
- Button states styled differently when enabled/disabled.
- Border styling for UI elements using drawable shapes.
- Uses `Timer` and `TimerTask` to handle repeated actions like generating cookies per second.

---

## 💡 Implementation Details

### Navigation & Fragments
- Uses `BottomNavigationView` to switch between `CookieFragment` and `StoreFragment`.
- Fragment switching is handled using `FragmentManager` inside `MainActivity`.

### Cookie Counter
- Stored as a static `double` in `MainActivity`.
- Updated every second using `Timer.scheduleAtFixedRate()`.
- Display uses abbreviations (`K`, `M`) for large numbers with custom formatting.

### Buttons
- Styled with:
  - `backgroundTint` for background color.
  - `drawableStart` for embedded icons.
  - Borders via a drawable XML shape.
- Enabled/disabled states use a `ColorStateList` for dynamic color changes.

### Images
- `ImageView` components can be updated via `setImageResource()` or `setImageDrawable()`.
- Click events handled using `setOnClickListener()` to trigger animations or particle effects.

### Fonts and Styling
- Global font customization can be achieved via themes or `setTypeface()`.
- Words are prevented from breaking mid-word using `android:breakStrategy="simple"` or handling programmatically.

---
## 🛠️ Notes

- `BigDecimal` can be used if extreme precision or large numbers are required.
- `Button`, `ImageView`, or any view can have borders applied using `shape` drawables.
- "Particles" (visual effects) can be simulated using small `ImageView`+`TextView` combos with animation on click.

---


## 👤 Author

- Developed by [@Mitja Filej](https://www.github.com/mit72)
- Inspired by [Cookie clicker by Orteil](https://orteil.dashnet.org/cookieclicker/)
---
