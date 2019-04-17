## Dagger 2 with components and sub-components

* Connecting your Application compoenent with your MainComponent making the application level dependencies in this case the Retrofit's ApiService to the Activity Level Module.

* The ApiService collected from the ApplicationComponent is passed on to the constructor of ViewModel using ViewModelFactory

* The data is loaded in the ViewModel (MainViewModel) RIght now only the response is logged.


All of this can be achieved in a better format using Android-dagger helper classes.

[Dagger-android-example](https://github.com/10XMairing/DaggerAndroidInjectorsExample)



References
[OFFICIAL DOCS](https://google.github.io/dagger)
