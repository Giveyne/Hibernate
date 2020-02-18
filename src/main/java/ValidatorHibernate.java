import HibernateShop.Product;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidatorHibernate {
    public static void main(String[] args) {

        // Валидатор значений.
        // Для того чтобы валидировать входящие значения нужно проставить анатации в entity классах
        // такие как @NotNull(message = "Поле не может быть нулем"
        //           @Size (min = 2, max = 10, message = "не корректное значение")

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Product product = new Product();
        validator.validate(product);
    }
}
