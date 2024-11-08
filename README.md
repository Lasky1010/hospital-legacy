# Hospital legacy application

## Installation and Setup

git clone https://github.com/Lasky1010/hospital-legacy.git

Run docker-compose
``` docker-compose up --build ```

## Endpoints

 Endpoint      | Description                                            | Parameters     | Response                     
---------------|--------------------------------------------------------|----------------|------------------------------|
 `api/clients` | Retrieves a list of all clients.                       | N/A            | A list of ClientDto objects. |
 `api/notes`   | Retrieves notes by client GUID,agency and date period. | GetNoteRequest | A list of NoteDto objects.   |
