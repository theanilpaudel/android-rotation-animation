# android-rotation-animation
A library for rotating a view in android.

### Installing

A step by step series of examples that tell you have to install this library in Android Studio

Add this to your app level build.gradle file repository part
```
maven { url 'https://dl.bintray.com/theanilpaudel/android/' }
```

Then in the dependencies add this

```
implementation 'theanilpaudel:rotatinganimation:1.0.0'
```

## Usage

This library is very easy to use.
```
Rotation rotation = new Rotation(imageView,fromDegree,toDegree,pivotX,pivotY,pivotXType,pivotYType);
rotation.roatateView(duration);
rotation.stopRotation(afterDuration);
```
Example
```
Rotation rotation = new Rotation(imageView,0,350,30,10,Rotation.ABSOLUTE,Rotation.ABSOLUTE);
rotation.roatateView(700);
rotation.stopRotation(5000);
```
```
<a href="https://imgflip.com/gif/2205u9"><img src="https://i.imgflip.com/2205u9.gif" title="made at imgflip.com"/></a>
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Anil Paudel** - *Initial work* - [theanilpaudel](https://github.com/theanilpaudel)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


