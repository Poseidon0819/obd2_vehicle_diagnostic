# Java OBD-2 library creating requests and interpreting responses

[![Build Status](https://travis-ci.com/sebastiankutschbach/obd2.svg?branch=master)](https://travis-ci.com/sebastiankutschbach/obd2)
[![Coverage Status](https://coveralls.io/repos/github/sebastiankutschbach/obd2/badge.svg?branch=master)](https://coveralls.io/github/sebastiankutschbach/obd2?branch=master)

Main purpose of this library is to handle the OBD-2 standard communication.

## Getting Started

Clone this repo.

### Prerequisites

- Java
- Gradle

### Building

The library can be built with the following command:

```
gradle clean build
```

## Running the tests

```
gradle clean test
```

## Implemented services (more to come)
|Service  |PID   |implemented |
|:-------:|:---: |:----------:|
| 0x01/0x02|0x00  |yes         |
| 0x01/0x02|0x01  |yes         |
| 0x01/0x02|0x02  |not yet     |
| 0x01/0x02|0x03  |yes         |
| 0x01/0x02|0x04  |yes         |
| 0x01/0x02|0x05  |yes         |
| 0x01/0x02|0x06  |yes         |
| 0x01/0x02|0x07  |yes         |
| 0x01/0x02|0x08  |yes         |
| 0x01/0x02|0x09  |yes         |
| 0x01/0x02|0x0A  |yes         |
| 0x01/0x02|0x0B  |yes         |
| 0x01/0x02|0x0C  |yes         |
| 0x01/0x02|0x0D  |yes         |
| 0x01/0x02|0x0E  |yes         |
| 0x01/0x02|0x0F  |yes         |
| 0x01/0x02|0x10  |yes         |
| 0x01/0x02|0x11  |yes         |
| 0x01/0x02|0x12  |yes         |
| 0x01/0x02|0x13  |yes         |
| 0x01/0x02|0x14  |yes         |
| 0x01/0x02|0x15  |yes         |
| 0x01/0x02|0x16  |yes         |
| 0x01/0x02|0x17  |yes         |
| 0x01/0x02|0x18  |yes         |
| 0x01/0x02|0x19  |yes         |
| 0x01/0x02|0x1A  |yes         |
| 0x01/0x02|0x1B  |yes         |
| 0x01/0x02|0x1C  |yes         |
| 0x01/0x02|0x1D  |yes         |
| 0x01/0x02|0x1E  |yes         |
| 0x01/0x02|0x1F  |yes         |
| 0x01/0x02|0x20  |yes         |
| 0x03    |N/A   |not yet     |
| 0x04    |N/A   |not yet     |
| 0x05    |0x0100|not yet     |
| 0x05    |0x0101|not yet     |
| 0x05    |0x0102|not yet     |
| 0x05    |0x0103|not yet     |
| 0x05    |0x0104|not yet     |
| 0x05    |0x0105|not yet     |
| 0x05    |0x0106|not yet     |
| 0x05    |0x0107|not yet     |
| 0x05    |0x0108|not yet     |
| 0x05    |0x0109|not yet     |
| 0x05    |0x010A|not yet     |
| 0x05    |0x010B|not yet     |
| 0x05    |0x010C|not yet     |
| 0x05    |0x010D|not yet     |
| 0x05    |0x010E|not yet     |
| 0x05    |0x010F|not yet     |
| 0x05    |0x0110|not yet     |
| 0x05    |0x0201|not yet     |
| 0x05    |0x0202|not yet     |
| 0x05    |0x0203|not yet     |
| 0x05    |0x0204|not yet     |
| 0x05    |0x0205|not yet     |
| 0x05    |0x0206|not yet     |
| 0x05    |0x0207|not yet     |
| 0x05    |0x0208|not yet     |
| 0x05    |0x0209|not yet     |
| 0x05    |0x020A|not yet     |
| 0x05    |0x020B|not yet     |
| 0x05    |0x020C|not yet     |
| 0x05    |0x020D|not yet     |
| 0x05    |0x020E|not yet     |
| 0x05    |0x020F|not yet     |
| 0x05    |0x0210|not yet     |
| 0x09    |0x00|not yet       |
| 0x09    |0x01|not yet       |
| 0x09    |0x02|not yet       |
| 0x09    |0x03|not yet       |
| 0x09    |0x04|not yet       |
| 0x09    |0x05|not yet       |
| 0x09    |0x06|not yet       |
| 0x09    |0x07|not yet       |
| 0x09    |0x08|not yet       |
| 0x09    |0x09|not yet       |
| 0x09    |0x0A|not yet       |
| 0x09    |0x0B|not yet       |

## Authors

* **CodeSpace Poseidon** - *Initial work*

See also the list of [contributors](https://github.com/sebastiankutschbach/obd2/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
