Rest service gemaakt door Jochem Kuus, V2A. Na de service gedeployed te hebben kunnen postcodes opgezocht worden via:
[host]:[poort]/rest/location/lookup/{postcode}

Hierbij zal {postcode} vervangen moeten worden door de postcode die opgezocht wordt.
Daaruit kunnen de volgende drie, JSON-string, responses komen:
- Een latitude en longitude
- Errorcode 404, de postcode volgt de juiste syntax maar is niet gevonden
- Errorcode 500, de postcode volgt niet de juiste syntax (juiste syntax wordt als voorbeeld meegegeven)

JUnit tests kunnen gevonden worden onder main/Java/Test.

Testplan staat in de hoofdmap
