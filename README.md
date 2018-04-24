## Getting started

Execute the following in the Jennifer management screen.

 1. Extension & Notice > Adapter and Plugin
 2. Click the Add button.
 3. Select the 'TRANSACTION' type.
 4. Enter the 'xviewlog' ID.
 5. Enter the adapter path directly or upload the file.
 6. Enter the class 'xview.LogAdapter'.


## How to use Options

Adapter options are shown in the table below.

| Key           | Default Value |
| ------------- |:-------------:|
| pattern       | [%startTime, %endTime, %collectTime] Domain=%domainName(%domainId), Instance=%instanceName(%instanceId), TXID=%txid, Client IP=%clientIp, Client ID=%clientId, User ID=%userId, Response Time=%responseTime, Front-end Time=%frontendTime, Network Time=%networkTime, SQL Time=%sqlTime, Fetch Time=%fetchTime, CPU Time=%cpuTime, External-call Time=%externalcallTime, ERROR=%error, Application=%application |
| date_format   | HH:mm:ss |
| full_path | ../logs/xviewlog.%d{yyyy-MM-dd_HH}.log |
| rolling_mode | true |

If there is no option, the default value of the table is applied. Here's how to add an option:

![2018-04-24 3 37 41](https://user-images.githubusercontent.com/2681333/39170254-d239579a-47d5-11e8-9ba8-698d76abc594.png)
 
 
## Supported version
 
Different versions of the server support different adapter versions.
 
| Adapter version           | Jennifer server version |
| ------------- |:-------------:|
| 1.0.0       | Greater than or equal to version 5.2.3 |
