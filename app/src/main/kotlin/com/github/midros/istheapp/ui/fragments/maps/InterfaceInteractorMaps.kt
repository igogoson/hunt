package com.github.midros.istheapp.ui.fragments.maps

import com.github.midros.istheapp.di.PerActivity
import com.github.midros.istheapp.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 11/03/18.
 */
@PerActivity
interface InterfaceInteractorMaps<V : InterfaceViewMaps> : InterfaceInteractor<V> {
    fun valueEventLocation()
    fun valueEventEnableGps()
    fun valueEventEnablePermission()
}