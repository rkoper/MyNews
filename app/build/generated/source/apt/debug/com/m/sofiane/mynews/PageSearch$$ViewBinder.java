// Generated code from Butter Knife. Do not modify!
package com.m.sofiane.mynews;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class PageSearch$$ViewBinder<T extends PageSearch> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230954, "field 'beginDate'");
    target.beginDate = finder.castView(view, 2131230954, "field 'beginDate'");
    view = finder.findRequiredView(source, 2131230768, "field 'mButtonBeginDate'");
    target.mButtonBeginDate = finder.castView(view, 2131230768, "field 'mButtonBeginDate'");
    view = finder.findRequiredView(source, 2131230769, "field 'mButtonEndDate'");
    target.mButtonEndDate = finder.castView(view, 2131230769, "field 'mButtonEndDate'");
    view = finder.findRequiredView(source, 2131230806, "field 'mEditTextSearchTerm'");
    target.mEditTextSearchTerm = finder.castView(view, 2131230806, "field 'mEditTextSearchTerm'");
    view = finder.findRequiredView(source, 2131230770, "field 'mSearchButton'");
    target.mSearchButton = finder.castView(view, 2131230770, "field 'mSearchButton'");
    view = finder.findRequiredView(source, 2131230776, "field 'arts'");
    target.arts = finder.castView(view, 2131230776, "field 'arts'");
    view = finder.findRequiredView(source, 2131230777, "field 'buisness'");
    target.buisness = finder.castView(view, 2131230777, "field 'buisness'");
    view = finder.findRequiredView(source, 2131230778, "field 'entrepreneurs'");
    target.entrepreneurs = finder.castView(view, 2131230778, "field 'entrepreneurs'");
    view = finder.findRequiredView(source, 2131230779, "field 'politics'");
    target.politics = finder.castView(view, 2131230779, "field 'politics'");
    view = finder.findRequiredView(source, 2131230780, "field 'sports'");
    target.sports = finder.castView(view, 2131230780, "field 'sports'");
    view = finder.findRequiredView(source, 2131230781, "field 'travels'");
    target.travels = finder.castView(view, 2131230781, "field 'travels'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends PageSearch> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.beginDate = null;
      target.mButtonBeginDate = null;
      target.mButtonEndDate = null;
      target.mEditTextSearchTerm = null;
      target.mSearchButton = null;
      target.arts = null;
      target.buisness = null;
      target.entrepreneurs = null;
      target.politics = null;
      target.sports = null;
      target.travels = null;
    }
  }
}
