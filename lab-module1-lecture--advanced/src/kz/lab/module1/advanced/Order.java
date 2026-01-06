package kz.lab.module1.advanced;

import java.time.LocalDateTime;
import java.util.Set;

public record Order(long id, double price, LocalDateTime orderDate, Set<String> items ) {
}
