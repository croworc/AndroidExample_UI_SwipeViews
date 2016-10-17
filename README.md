# AndroidExample_UI_SwipeViews

`AndroidExample_UI_SwipeViews` is a companion Android app for the **Udacity** course [Build < anything > in Android](https://www.udacity.com/course/how-to-create-anything-in-android--ud802).

Its a really simple Android example app, implemented as an AndroidStudio project,
showcasing Android's `ViewPager` widget from the `support library`and the associated `FragmentPagerAdapter`.
Plus, there's also a `TabLayout` that allows for switching to the desired page directly.

As a little bonus, the app implements the framework's `onBackPressed()` method to have the `Back button` handle the back navigation from page to page, or - if already at the first page - to exit the app.

I am just learning Android app development (and also `git` and `GitHub`) and
these sample repos are just a means of practicing - so please don't expect mind blowing
highlights here.  :smile:

This app just implements and demonstrates the bare-to-the-bones feature(s) as advertised,
not much else.

## Installation

AndroidStudio project. No external dependencies.
Clone or download as ZIP and import into AndroidStudio.

Targets Android SDK version 24, so depending on your installation,
you may be prompted to download that SDK version during build.

## Usage

Just swipe right on the first screen.
A second page (`Fragment`) will be displayed, using the default animation for the transitioning between the screens.
Swipe right or left to advance to the third and last page, or to return to the first page.
Alternatively, tap on any one of the three tabs above the pages to navigate to the respective page.
Pressing the device's `Back` button will return you to the previous page, or - if already at the first page - exit the app.

## Contributing

See: repo description - just a learning/demo app, nothing breathtakingly elaborate!
But, if you really want to:
  1. Fork it!
  2. Create your feature branch: `git checkout -b my-new-feature`
  3. Commit your changes: `git commit -am 'Add some feature'`
  4. Push to the branch: `git push origin my-new-feature`
  5. Submit a pull request :D

## History

Version: 1

## Credits

  - This sample is based on two **tutorials**, found [here](http://kiory.pro/blog/creating-an-android-app-using-tabs-with-swipe-views/) and [here](http://www.androidhive.info/2015/09/android-material-design-working-with-tabs/).
  - **Google's** official **training** for how to use the `ViewPager` widget can be found [here](https://developer.android.com/training/animation/screen-slide.html)
  - **Google's** official training **Creating Swipe Views with Tabs**  can be found  [here](https://developer.android.com/training/implementing-navigation/lateral.html)
  - **Google's** official **Material Guidelines** for tabs can be found [here](https://material.google.com/components/tabs.html#tabs-specs)
  - See also: **Codepath Cliffnotes** for a short guide on [some of the most popular Android framework UI widgets](http://guides.codepath.com/android/Working-with-Input-Views).
  - And here's a link to a curated list of some of the [most popular open source widgets](https://github.com/wasabeef/awesome-android-ui).
  - And last but not least: The **template** for this **README.md** file comes from [zenorocha](https://gist.github.com/zenorocha/4526327).

## License

`MIT license`.
See: [LICENSE.md](./LICENSE.md)
