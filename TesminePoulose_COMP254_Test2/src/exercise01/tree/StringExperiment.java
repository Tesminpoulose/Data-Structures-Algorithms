/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exercise01.tree;
/**
 * Provides an empirical test of the efficiency of repeated string concatentation
 * versus use of the StringBuilder class.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class StringExperiment {

  /** Uses repeated concatenation to compose a String with n copies of character c. */
  public static String repeat1(char c, int n) {
    String answer = "";
    for (int j=0; j < n; j++)
      answer += c;
    return answer;
  }

  /** Uses StringBuilder to compose a String with n copies of character c. */
  public static String repeat2(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int j=0; j < n; j++)
      sb.append(c);
    return sb.toString();
  }
}
