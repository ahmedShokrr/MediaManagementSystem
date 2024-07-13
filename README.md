# MediaManagementSystem

## Overview

This project is designed as part of an Object-Oriented Programming (OOP) course assignment. It implements a media management system inspired by movie websites like IMDB.com. The system allows for managing various types of shows (Movies, TV Shows, Mini Series) and cast members (Actors, Directors, Camera Men). Additionally, it includes a text processing utility that handles multi-line strings with various features.

## Features

### Media Management

- **Interfaces and Classes**:
  - `Show` interface with methods: `getTitle()`, `getCast()`, and `getEpisodes()`.
  - Implementing classes: `Movie`, `TVShow`, `MiniSeries`.

- **Cast Members**:
  - Abstract class `CastMember` with methods: `getName()`, `getBirthdate()`.
  - Subclasses: `Actor`, `Director`, `CameraMan`.

- **Statistics**:
  - Method `showStats()` in `Show` interface with two versions:
    - `showStats()`: Displays overall popularity.
    - `showStats(String country)`: Displays popularity in a specific country.

### Text Processing Utility

- **Class `Lines`**:
  - Manages a list of strings, each representing a line of text.
  - Methods:
    - `trimSpace()`: Removes spaces from all lines.
    - `addText(String text)`: Appends new text to the lines.
    - `getLinesBeginWith(String seq)`: Returns lines that begin with a specific sequence.
    - `printWithlines()`: Prints lines with numbering.
    - `extractNumbers()`: (Bonus) Extracts all numbers from the text.
    - `removeEvenLength()`: Removes lines with even length.
    - `findReplace(String find, String replace)`: (Bonus) Finds and replaces text.
    - `getURLs()`: Extracts all URLs from the lines.
    - `getURLs(String protocol)`: Extracts URLs with a specific protocol.
    - `getLine(int num)`: Returns the line at the specified position.


## License

This project is licensed under the MIT License.


