package Fragments

import android.content.Context
import android.media.Rating
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R


class FragmentRating : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_rating, container, false)
        val activity = getActivity() as EncuestaActivity
        val rating = arguments!!.getFloat("rating")
        val ratingBar = vista.findViewById<RatingBar>(R.id.ratingBar)
        ratingBar.rating = rating
        activity.guardarRating(rating)
        ratingBar.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            val activity = getActivity() as EncuestaActivity
            activity.guardarRating(rating)
        }

        return vista
    }
}
