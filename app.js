const express = require('express');
const app = express();

const flights = [
  {
    id: '1',
    flightNumber: 'AB123',
    airline: 'Airline A',
    departureAirport: 'Airport X',
    departureTime: '10:00 AM',
    arrivalAirport: 'Airport Y',
    arrivalTime: '12:00 PM',
    price: 150.0,
    seatsAvailable: 100,
  },
  {
    id: '2',
    flightNumber: 'CD456',
    airline: 'Airline B',
    departureAirport: 'Airport Y',
    departureTime: '01:00 PM',
    arrivalAirport: 'Airport Z',
    arrivalTime: '03:30 PM',
    price: 200.0,
    seatsAvailable: 80,
  },
  {
    id: '3',
    flightNumber: 'EF789',
    airline: 'Airline C',
    departureAirport: 'Airport Z',
    departureTime: '05:30 PM',
    arrivalAirport: 'Airport X',
    arrivalTime: '08:30 PM',
    price: 180.0,
    seatsAvailable: 120,
  },
];

app.get('/flights', (req, res) => {
  res.json(flights);
});

module.exports = app;
