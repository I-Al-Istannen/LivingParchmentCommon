## About

This is the third iteration of the small library helper I wrote. It is intended for my personal use, though I doubt it will actually be used. We are just way too unorganized :)

## Features

This is the "common core" for the back- and frontend.
Due to that it just provides a few things:

* Json (de-)serialization
* Core POJOs: Book, BookLocation, QueryType
* A whole lot of standardized Responses and Requests
  that define how the front and backend communicate.

## Json (de-)serialization

Currently`Gson` is used for (de-)serialization JSON.
This is subject to change though,
as the backend is forced to use Jackson (Dropwizard is quite opinionated).

## Request/Response POJOs

All requests return `HTTP 200 — OK`
and a specialized enum denotes the status of the request.
That enum and the server response is fixed via a POJO inside this repo.
Additionally some more sophisticated requests are *also* provided as POJOs.
