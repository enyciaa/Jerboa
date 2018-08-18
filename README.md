# Jerboa
A JVM library with common code that can be used across projects

## Warning
This a personal library, and is not intended to be used by others. The Api may change at anytime.

## Animations
A collection of entities and functions that make dealing animations simpler

Entities:
*Coordinate* contains an x and y coordinate
*Rectangle* a bounded rectangle that can be animated

## Colors
A collection of entities and functions that make dealing with colors simpler

Entities:
*RgbColor*
*HexColor*

## Extensions
A collection of functions that are named in an appropriate manner that allows them to be used from simply looking at a classes autocomplete.

Includes:
*BitwiseFlags*
*Int*
*List*
*Long*
*String*

## Library helpers
Classes and functions that make using a library easier

Sub packages include
- **RxJava2**

## Logging
Classes to simplify exceptions and logging. This package needs a lot of work.

## Platform
To follow a use case driven, multi-module architecture or to use multi platform projects, the common/usecase module must have access to pure kotlin interfaces of platform implementations. For example, Toasts are a platform detail and the common module can not know toasts exist, so to display a toast the common module must call an interface. This interface has an implementation in an android module and the the hook-up is achieved via dependency injection.

Platform interfaces include:
**Announcer** Toasts, Snackbars, Alert dialogs.
**Analytics** Send events and exceptions to analytics.
**ResourceProvider** For example, Strings
**TimeWrapper** Common time behaviour

## Ui
These are classes that can be used in the ui layer of an app. They are common across platforms. i.e. any element of this package could be applicable to iOS or Android or Web

Includes:
*LifecycleReceiver* to be used by a ViewModel or Presenter
*ItemClickListener* returns a generic class when an item is clicked
*Orientation* enum with HORIZONTAL and VERTICAL
