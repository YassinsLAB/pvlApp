package com.example.pvlapp

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*



class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var myItems : ArrayList<String>  = ArrayList<String>()
    var MosaikPersons: ArrayList<MosaikPerson> = ArrayList<MosaikPerson>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val TAG: String = "MainActivity"
        var senslist: List<Sensor>

        var sMgr : SensorManager = this.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        var  sensList = sMgr.getSensorList(Sensor.TYPE_ALL)
        var ListView: ListView = findViewById<ListView>(R.id.myListView)
        val SensorAdapter: mySensorAdapter = mySensorAdapter(this,android.R.layout.simple_list_item_2, sensList)
        ListView.adapter = SensorAdapter


/*
        myItems.add("Dig")
        myItems.add("Dag")
        myItems.add("Digedag")

        MosaikPersons.add(MosaikPerson("Dig","black",1995))
        MosaikPersons.add(MosaikPerson("Dag","Blond",1955))
        MosaikPersons.add(MosaikPerson("dong","Red",1993))
        var listView: ListView = findViewById<ListView>(R.id.myListView)
        val myMosaikPersonAdapter: ListAdapter=
            myMosaikPersonAdapter(this,android.R.layout.simple_list_item_2, MosaikPersons)
            listView.adapter = myMosaikPersonAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent: AdapterView<*>, view, position, arg3:Long ->
            val item: MosaikPerson = parent.getItemAtPosition(position) as MosaikPerson
            val context: Context = applicationContext
            var toast: Toast = Toast.makeText(context, item.nickname, Toast.LENGTH_LONG)
            toast.show()


        }


*/

        //////////SensorList//////////

        //////////SonsorList//////////
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
