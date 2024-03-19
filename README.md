# Welcome to Loan Account Module!

Loan Account Module is an simple API designed to calculate loan account.


# Prerequisite :
- Java version 17
- Docker
- Docker Compose

# How to Run the Project :

1. Clone this repository.

2. Go to terminal and go to this repository.

3. Make sure your local device installed with Docker and Docker Compose.

4. Run `docker-compose up`

5. Wait for a while to setup the Loan Account Module, before start to use the API.

6. Run this url in postman :
- Loan Account API `baseUrl`: `http:/localhost:8080/`

7. To kill the Apps `CTRL + C`

# API Documentation
### Calculate Loan Endpoint :
### Register: `{baseUrl}/api/calculate-loan`
### Method : POST

**Request Body:**
```json
{
  "amount": 10000000,
  "tenor": 12,
  "interestRate": 5,
  "startDate":"2023-08-10"
}
```
**Response Success:**
```json
{
  "data": [
    {
      "no": 1,
      "date": "2023-09-10",
      "totalPayment": "856074.82",
      "principalPayment": "356075",
      "interestPayment": "500000",
      "remainingPrincipal": "9643925"
    },
    {
      "no": 2,
      "date": "2023-10-10",
      "totalPayment": "856074.82",
      "principalPayment": "373879",
      "interestPayment": "482196",
      "remainingPrincipal": "9270047"
    },
    {
      "no": 3,
      "date": "2023-11-10",
      "totalPayment": "856074.82",
      "principalPayment": "392572",
      "interestPayment": "463502",
      "remainingPrincipal": "8877474"
    },
    {
      "no": 4,
      "date": "2023-12-10",
      "totalPayment": "856074.82",
      "principalPayment": "412201",
      "interestPayment": "443874",
      "remainingPrincipal": "8465273"
    },
    {
      "no": 5,
      "date": "2024-01-10",
      "totalPayment": "856074.82",
      "principalPayment": "432811",
      "interestPayment": "423264",
      "remainingPrincipal": "8032462"
    },
    {
      "no": 6,
      "date": "2024-02-10",
      "totalPayment": "856074.82",
      "principalPayment": "454452",
      "interestPayment": "401623",
      "remainingPrincipal": "7578010"
    },
    {
      "no": 7,
      "date": "2024-03-10",
      "totalPayment": "856074.82",
      "principalPayment": "477174",
      "interestPayment": "378901",
      "remainingPrincipal": "7100836"
    },
    {
      "no": 8,
      "date": "2024-04-10",
      "totalPayment": "856074.82",
      "principalPayment": "501033",
      "interestPayment": "355042",
      "remainingPrincipal": "6599803"
    },
    {
      "no": 9,
      "date": "2024-05-10",
      "totalPayment": "856074.82",
      "principalPayment": "526085",
      "interestPayment": "329990",
      "remainingPrincipal": "6073718"
    },
    {
      "no": 10,
      "date": "2024-06-10",
      "totalPayment": "856074.82",
      "principalPayment": "552389",
      "interestPayment": "303686",
      "remainingPrincipal": "5521329"
    },
    {
      "no": 11,
      "date": "2024-07-10",
      "totalPayment": "856074.82",
      "principalPayment": "580008",
      "interestPayment": "276066",
      "remainingPrincipal": "4941321"
    },
    {
      "no": 12,
      "date": "2024-08-10",
      "totalPayment": "856074.82",
      "principalPayment": "609009",
      "interestPayment": "247066",
      "remainingPrincipal": "4332312"
    }
  ],
  "error": null,
  "status": 200
}
```




