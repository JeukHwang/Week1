package com.madcamp.week1.gallery

import android.os.Bundle
import android.transition.Transition
import android.view.MenuItem
import androidx.fragment.app.FragmentActivity
import coil.load
import com.madcamp.week1.databinding.ActivityGalleryDetailBinding

class GalleryDetailActivity : FragmentActivity() {
  companion object {
    const val extraTitle: String = "title"
    const val extraPhotoUrl = "photoUrl"
  }

  private lateinit var binding: ActivityGalleryDetailBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityGalleryDetailBinding.inflate(layoutInflater)
    //setContentView(R.layout.activity_gallery_detail)
    setContentView(binding.root)

    val intent = intent
    var bundle = Bundle()
    bundle = intent.getBundleExtra("bundle_key")!!
    val info_photourl = bundle.getString("info_photourl")
    if (info_photourl != null) {
      binding.imageView.load(info_photourl)
    }
    //    val title = intent.getStringExtra(extraTitle)
    //    val photoUrl = intent.getStringExtra(extraPhotoUrl)
    //    this@GalleryDetailActivity.runOnUiThread { binding.textView.text = title }

    //    binding.imageView.load(R.drawable.baseline_perm_contact_calendar_24) {
    //      placeholder(R.drawable.baseline_perm_contact_calendar_24)
    //      error(R.drawable.baseline_perm_contact_calendar_24)
    //      crossfade(true)
    //    }
    window.sharedElementEnterTransition.addListener(
        object : Transition.TransitionListener {
          override fun onTransitionEnd(transition: Transition?) {
            transition?.removeListener(this)
          }

          override fun onTransitionResume(transition: Transition?) {
            // To change body of created functions use File | Settings | File Templates.
          }

          override fun onTransitionPause(transition: Transition?) {
            // To change body of created functions use File | Settings | File Templates.
          }

          override fun onTransitionCancel(transition: Transition?) {
            // To change body of created functions use File | Settings | File Templates.
          }

          override fun onTransitionStart(transition: Transition?) {
            // To change body of created functions use File | Settings | File Templates.
          }
        })
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home) {
      // to reverse the scene transition animation
      supportFinishAfterTransition()
    }
    return super.onOptionsItemSelected(item)
  }
}
