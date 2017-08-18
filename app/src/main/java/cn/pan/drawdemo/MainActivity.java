package cn.pan.drawdemo;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    List<PageModel> pageModels = new ArrayList<>();
    {
        pageModels.add(new PageModel(R.layout.sample_color, R.string.title_draw_color, R.layout.draw_color));
        pageModels.add(new PageModel(R.layout.sample_circle, R.string.title_draw_circle, R.layout.draw_circle));
        pageModels.add(new PageModel(R.layout.sample_rect, R.string.title_draw_rect, R.layout.draw_rect));
        pageModels.add(new PageModel(R.layout.sample_point, R.string.title_draw_point, R.layout.draw_point));
        pageModels.add(new PageModel(R.layout.sample_oval, R.string.title_draw_oval, R.layout.practice_oval));
        pageModels.add(new PageModel(R.layout.sample_line, R.string.title_draw_line, R.layout.practice_line));
        pageModels.add(new PageModel(R.layout.sample_round_rect, R.string.title_draw_round_rect, R.layout.practice_round_rect));
        pageModels.add(new PageModel(R.layout.sample_arc, R.string.title_draw_arc, R.layout.practice_arc));
        pageModels.add(new PageModel(R.layout.sample_path, R.string.title_draw_path, R.layout.practice_path));
        pageModels.add(new PageModel(R.layout.sample_histogram, R.string.title_draw_histogram, R.layout.practice_histogram));
        pageModels.add(new PageModel(R.layout.sample_pie_chart, R.string.title_draw_pie_chart, R.layout.practice_pie_chart));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PageFragment extends Fragment {
        @LayoutRes int sampleLayoutRes;
        @LayoutRes int practiceLayoutRes;

        public static PageFragment newInstance(@LayoutRes int sampleLayoutRes, @LayoutRes int practiceLayoutRes) {
            PageFragment fragment = new PageFragment();
            Bundle args = new Bundle();
            args.putInt("sampleLayoutRes", sampleLayoutRes);
            args.putInt("practiceLayoutRes", practiceLayoutRes);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_main, container, false);

            ViewStub sampleStub = (ViewStub) view.findViewById(R.id.sampleStub);
            sampleStub.setLayoutResource(sampleLayoutRes);
            sampleStub.inflate();

            ViewStub practiceStub = (ViewStub) view.findViewById(R.id.practiceStub);
            practiceStub.setLayoutResource(practiceLayoutRes);
            practiceStub.inflate();

            return view;
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle args = getArguments();
            if (args != null) {
                sampleLayoutRes = args.getInt("sampleLayoutRes");
                practiceLayoutRes = args.getInt("practiceLayoutRes");
            }
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            PageModel pageModel = pageModels.get(position);
            return PageFragment.newInstance(pageModel.sampleLayoutRes, pageModel.practiceLayoutRes);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return pageModels.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getString(pageModels.get(position).titleRes);
        }
    }

    private class PageModel implements Serializable{
        @LayoutRes
        int sampleLayoutRes;
        @StringRes
        int titleRes;
        @LayoutRes
        int practiceLayoutRes;

        PageModel(@LayoutRes int sampleLayoutRes, @StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
            this.sampleLayoutRes = sampleLayoutRes;
            this.titleRes = titleRes;
            this.practiceLayoutRes = practiceLayoutRes;
        }
    }
}
