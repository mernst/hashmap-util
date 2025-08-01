package org.plumelib.util;

/**
 * {@code Hasher} is intended to work like {@code Comparable}: it is an optional argument to a
 * hashing data structure (such as some implementations of {@code HashSet}, {@code HashMap}, or
 * {@code WeakHashMap}) which specifies the {@code hashCode()} and {@code equals()} methods.
 *
 * <p>If no Hasher is provided, then clients should act as if the following Hasher were provided:
 *
 * <pre>
 *   class DefaultHasher {
 *     int hashCode(Object o) { return o.hashCode(); }
 *     boolean equals(Object o, Object o2) { return o.equals(o2); }
 *   }
 * </pre>
 */
public interface Hasher {

  /**
   * hashCode function for objects under consideration (not for Hasher objects).
   *
   * @param o object whose hash code to compute
   * @return o's hash code
   */
  int hashCode(Object o);

  /**
   * The equality function over the objects being hashed.
   *
   * <p>Has nothing to do with testing Hashers themselves for equality.
   *
   * @param o1 the first value to test for equality
   * @param o2 the second value to test for equality
   * @return true if o1 equals o2
   */
  boolean equals(Object o1, Object o2);
}
