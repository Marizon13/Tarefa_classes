package br.com.felipe;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})

public @interface Tabela {
	
	String value();
	String[] categoria();
	long precoFilme();

}
