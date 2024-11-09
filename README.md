# Hospital legacy application

## Installation and Setup

git clone https://github.com/Lasky1010/hospital-legacy.git

Run ``mvn clean install``

At the first launch you should create database, run application, and then run migration scripts

Run docker-compose (or before it change env vars in [docker-compose.yaml](docker-compose.yaml))
``` docker-compose up --build ```

## Endpoints

| Endpoint      | Description                                            | Parameters     | Response                     |
|---------------|--------------------------------------------------------|----------------|------------------------------|
| `api/clients` | Retrieves a list of all clients.                       | N/A            | A list of ClientDto objects. |
| `api/notes`   | Retrieves notes by client GUID,agency and date period. | GetNoteRequest | A list of NoteDto objects.   |
