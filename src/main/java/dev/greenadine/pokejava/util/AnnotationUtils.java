package dev.greenadine.pokejava.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public final class AnnotationUtils {

    /**
     * Gets the value of the "value" method of the given {@link Annotation} on the given {@link AnnotatedElement}.
     *
     * @param annotatedElement the {@link AnnotatedElement}.
     * @param annoClass the {@link Annotation} class.
     *
     * @return the value of the annotation on the given {@link AnnotatedElement}.
     */
    public static String getValue(AnnotatedElement annotatedElement, Class<? extends Annotation> annoClass) {
        try {
            Method method = annotatedElement.getAnnotation(annoClass).getClass().getMethod("value");
            method.setAccessible(true);
            return (String) method.invoke(annotatedElement.getAnnotation(annoClass));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Returns whether the given {@link AnnotatedElement} has the given annotation.
     *
     * @param annotatedElement the annotated element.
     * @param annoClass the annotation.
     *
     * @return {@code true} if the {@link AnnotatedElement} has the given annotation, {@code false} otherwise.
     */
    public static boolean hasAnnotation(AnnotatedElement annotatedElement, Class<? extends Annotation> annoClass) {
        return annotatedElement.getAnnotation(annoClass) != null;
    }
}
