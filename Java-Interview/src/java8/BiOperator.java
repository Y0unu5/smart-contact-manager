package java8;

@FunctionalInterface
public interface BiOperator<T> {
	 T apply(T t1, T t2);
}
