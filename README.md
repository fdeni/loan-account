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
      "principalPayment": "814408",
      "interestPayment": "41667",
      "remainingPrincipal": "9185592"
    },
    {
      "no": 2,
      "date": "2023-10-10",
      "totalPayment": "856074.82",
      "principalPayment": "817802",
      "interestPayment": "38273",
      "remainingPrincipal": "8367790"
    },
    {
      "no": 3,
      "date": "2023-11-10",
      "totalPayment": "856074.82",
      "principalPayment": "821209",
      "interestPayment": "34866",
      "remainingPrincipal": "7546581"
    },
    {
      "no": 4,
      "date": "2023-12-10",
      "totalPayment": "856074.82",
      "principalPayment": "824631",
      "interestPayment": "31444",
      "remainingPrincipal": "6721951"
    },
    {
      "no": 5,
      "date": "2024-01-10",
      "totalPayment": "856074.82",
      "principalPayment": "828067",
      "interestPayment": "28008",
      "remainingPrincipal": "5893884"
    },
    {
      "no": 6,
      "date": "2024-02-10",
      "totalPayment": "856074.82",
      "principalPayment": "831517",
      "interestPayment": "24558",
      "remainingPrincipal": "5062367"
    },
    {
      "no": 7,
      "date": "2024-03-10",
      "totalPayment": "856074.82",
      "principalPayment": "834982",
      "interestPayment": "21093",
      "remainingPrincipal": "4227385"
    },
    {
      "no": 8,
      "date": "2024-04-10",
      "totalPayment": "856074.82",
      "principalPayment": "838461",
      "interestPayment": "17614",
      "remainingPrincipal": "3388925"
    },
    {
      "no": 9,
      "date": "2024-05-10",
      "totalPayment": "856074.82",
      "principalPayment": "841954",
      "interestPayment": "14121",
      "remainingPrincipal": "2546970"
    },
    {
      "no": 10,
      "date": "2024-06-10",
      "totalPayment": "856074.82",
      "principalPayment": "845462",
      "interestPayment": "10612",
      "remainingPrincipal": "1701508"
    },
    {
      "no": 11,
      "date": "2024-07-10",
      "totalPayment": "856074.82",
      "principalPayment": "848985",
      "interestPayment": "7090",
      "remainingPrincipal": "852523"
    },
    {
      "no": 12,
      "date": "2024-08-10",
      "totalPayment": "856074.82",
      "principalPayment": "852523",
      "interestPayment": "3552",
      "remainingPrincipal": "0"
    }
  ],
  "error": null,
  "status": 200
}
```




