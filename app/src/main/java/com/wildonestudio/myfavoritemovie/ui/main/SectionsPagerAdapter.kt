package com.wildonestudio.myfavoritemovie.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.wildonestudio.myfavoritemovie.MovieGenre
import kotlin.random.Random


class SectionsPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val listOfGenre = mutableListOf<MovieGenre>()
    fun generateDummyGenre() {
        for (i in 0 until 2) {
            listOfGenre.add(MovieGenre(i.toString()))
        }
    }

    override fun getItem(position: Int): Fragment {

        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listOfGenre[position].genreName
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return listOfGenre.size
    }
}