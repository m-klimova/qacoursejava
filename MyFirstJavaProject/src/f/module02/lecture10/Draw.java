package f.module02.lecture10;

// Interface with ONLY ONE method is known as FunctionalInterface
@FunctionalInterface
public interface Draw {
	Rectangle draw(double xSide);
}
