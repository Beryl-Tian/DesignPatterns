package org.example.di_container;

import java.io.InputStream;
import java.util.List;

public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
}
