package com.prueba.records;

import java.util.List;

public record Response<T>(int estado, String mensaje, List<T> data) {

}
