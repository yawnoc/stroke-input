# Stroke Input Method (筆畫輸入法) for Android

![App logo.](app/src/main/res/mipmap-hdpi/icon_launcher.png)

A minimalist Chinese keyboard where you input characters
by typing stroke sequences (e.g. 天 is ㇐㇐㇒㇔).

![Screenshot of the keyboard during stroke input.](stroke-input-screenshot.png)


## Features

* Good character support (over 28k characters) including vernacular Cantonese
* User preference for traditional or simplified characters
* No permissions, tracking, etc.
* Deterministic candidate generation which doesn't learn user input


## Releases

[<img
    alt="Get it on F-Droid."
    src="https://gitlab.com/fdroid/artwork/-/raw/master/badge/get-it-on.png"
    width="240"
    height="auto">][f-droid]
[<img
    alt="Get it on Google Play."
    src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png"
    width="240"
    height="auto">][google-play]

[f-droid]: https://f-droid.org/en/packages/io.github.yawnoc.strokeinput/
[google-play]: https://play.google.com/store/apps/details?id=io.github.yawnoc.strokeinput


## License

**Copyright 2021–2022 Conway** <br>
Licensed under the GNU General Public License v3.0 (GPL-3.0-only). <br>
This is free software with NO WARRANTY etc. etc., see [LICENSE]. <br>

For detailed copyright information in relation to dependencies,
see [app/src/main/assets/about.html].


## Assets

### `*.cmd` (CMD)

These are [Conway-Markdown (CMD)] files,
used to compile the HTML files by running Conway-Markdown
whilst in the root directory of this repository.

### `*.html` (HTML)

These are the actual About and Help files that get served in the app.

### `*.inc` (Inclusions)

These are files containing common [Conway-Markdown (CMD)]
for inclusion in the CMD files.

### `*.txt` (Text)

These are data files used by the input method.
Taken from Conway Stroke Data ([CC-BY-4.0] / [Public Domain]),
see <<https://github.com/stroke-input/stroke-input-data>>.

### `StrokeInputFont.ttf`

This is the font used for the keyboard.
Taken from Stroke Input Font ([GPL-3.0-only]),
see <<https://github.com/stroke-input/stroke-input-font>>.

### `webview.css`

This is the stylesheet for the HTML files that get served in the app.


[LICENSE]: LICENSE
[GPL-3.0-only]: https://www.gnu.org/licenses/
[CC-BY-4.0]: https://creativecommons.org/licenses/by/4.0/
[Public Domain]: https://creativecommons.org/publicdomain/zero/1.0/
[app/src/main/assets/about.html]:
  https://htmlpreview.github.io/?https://github.com/stroke-input/stroke-input-android/blob/master/app/src/main/assets/about.html
[Conway-Markdown (CMD)]:
  https://github.com/conway-markdown/conway-markdown
