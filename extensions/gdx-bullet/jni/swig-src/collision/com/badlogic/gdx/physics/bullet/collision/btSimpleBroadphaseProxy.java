/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSimpleBroadphaseProxy extends btBroadphaseProxy {
	private long swigCPtr;
	
	protected btSimpleBroadphaseProxy(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btSimpleBroadphaseProxy_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSimpleBroadphaseProxy, normally you should not need this constructor it's intended for low-level usage. */
	public btSimpleBroadphaseProxy(long cPtr, boolean cMemoryOwn) {
		this("btSimpleBroadphaseProxy", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btSimpleBroadphaseProxy_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSimpleBroadphaseProxy obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btSimpleBroadphaseProxy(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNextFree(int value) {
    CollisionJNI.btSimpleBroadphaseProxy_nextFree_set(swigCPtr, this, value);
  }

  public int getNextFree() {
    return CollisionJNI.btSimpleBroadphaseProxy_nextFree_get(swigCPtr, this);
  }

  public btSimpleBroadphaseProxy() {
    this(CollisionJNI.new_btSimpleBroadphaseProxy__SWIG_0(), true);
  }

  public btSimpleBroadphaseProxy(Vector3 minpt, Vector3 maxpt, int shapeType, long userPtr, short collisionFilterGroup, short collisionFilterMask, long multiSapProxy) {
    this(CollisionJNI.new_btSimpleBroadphaseProxy__SWIG_1(minpt, maxpt, shapeType, userPtr, collisionFilterGroup, collisionFilterMask, multiSapProxy), true);
  }

  public void SetNextFree(int next) {
    CollisionJNI.btSimpleBroadphaseProxy_SetNextFree(swigCPtr, this, next);
  }

  public int GetNextFree() {
    return CollisionJNI.btSimpleBroadphaseProxy_GetNextFree(swigCPtr, this);
  }

}
