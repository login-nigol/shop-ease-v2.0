package shop_ease_v20.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop_ease_v20.models.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByproductNameContainingIgnoreCase(String productName);
}

// @Repository — это аннотация Spring, которая указывает, что интерфейс или класс является репозиторием (DAO)
// для работы с базой данных.
//
// public interface ProductRepository extends JpaRepository<Product, Long> — интерфейс ProductRepository наследует
// JpaRepository, где:
//
// Product — это сущность (Entity), с которой работает репозиторий.
// Long — это тип данных идентификатора сущности Product (обычно это поле id).
// List<Product> findByProductNameContainingIgnoreCase(String name) — это метод, который автоматически реализуется
// Spring Data JPA. Он позволяет найти список продуктов, у которых имя (productName) содержит строку name без учета регистра:
//
//Containing — означает, что поиск будет по части строки (аналог SQL-оператора LIKE).
//IgnoreCase — поиск будет проводиться без учета регистра символов.
