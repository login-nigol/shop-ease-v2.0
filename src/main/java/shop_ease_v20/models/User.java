package shop_ease_v20.models;

import jakarta.persistence.*;
//import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop_ease_v20.enums.Role;

import shop_ease_v20.models.Order;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // поле для хранения роли пользователя.

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}

// @Id: Это аннотация, которая указывает, что поле id является первичным ключом (primary key) в таблице базы данных.

// @GeneratedValue(strategy = GenerationType.IDENTITY): Данная аннотация указывает на стратегию генерации значений
// для поля id. GenerationType.IDENTITY означает, что значение id будет генерироваться автоматически при добавлении
// новой записи в таблицу, используя стратегию автоинкремента, поддерживаемую базой данных.

// @Enumerated(EnumType.STRING): Эта аннотация указывает, что поле role типа Role будет храниться в базе данных как строка.
// Перечисление (enum) в Java может быть сохранено в базе либо как строка (имя константы), либо как числовое значение.
// В данном случае используется стратегия STRING, то есть в базе данных будет храниться имя константы
// (например, "USER" или "ADMIN").

// @OneToMany указывает, что один объект класса User может быть связан с несколькими объектами класса Order. Это связь
// "один ко многим", что означает, что один пользователь может иметь множество заказов.

// mappedBy = "user" указывает, что эта сторона связи является обратной стороной, и управление связью осуществляется
// через поле user в сущности Order. Это значит, что поле user в классе Order является владельцем связи (указанным
// в аннотации @ManyToOne в классе Order), и именно там хранится информация о том, как заказ связан с пользователем.