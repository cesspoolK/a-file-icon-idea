/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.mallowigi.icons.patchers;

import com.intellij.openapi.util.IconPathPatcher;
import com.intellij.util.xmlb.annotations.Property;

import java.util.Collections;
import java.util.Set;

public final class IconPathPatchers {
  @Property
  private Set<IconPathPatcher> iconPatchers;

  @Property
  private Set<IconPathPatcher> glyphPatchers;

  @Property
  private Set<IconPathPatcher> filePatchers;

  public Set<IconPathPatcher> getIconPatchers() {
    return Collections.unmodifiableSet(iconPatchers);
  }

  public Set<IconPathPatcher> getGlyphPatchers() {
    return Collections.unmodifiableSet(glyphPatchers);
  }

  public Set<IconPathPatcher> getFilePatchers() {
    return Collections.unmodifiableSet(filePatchers);
  }
}
