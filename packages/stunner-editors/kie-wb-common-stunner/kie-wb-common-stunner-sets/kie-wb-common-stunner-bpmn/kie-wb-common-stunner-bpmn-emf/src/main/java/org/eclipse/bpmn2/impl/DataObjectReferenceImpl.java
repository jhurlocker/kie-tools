/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.impl;

import com.google.gwt.user.client.rpc.GwtTransient;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DataObject;
import org.eclipse.bpmn2.DataObjectReference;
import org.eclipse.bpmn2.DataState;
import org.eclipse.bpmn2.ItemAwareElement;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectReferenceImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectReferenceImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectReferenceImpl#getDataObjectRef <em>Data Object Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataObjectReferenceImpl extends FlowElementImpl implements DataObjectReference {
	/**
	 * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataState()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected DataState dataState;

	/**
	 * The cached value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSubjectRef()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected ItemDefinition itemSubjectRef;

	/**
	 * The cached value of the '{@link #getDataObjectRef() <em>Data Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectRef()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected DataObject dataObjectRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.DATA_OBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataState getDataState() {
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
		DataState oldDataState = dataState;
		dataState = newDataState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, oldDataState, newDataState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataState(DataState newDataState) {
		if (newDataState != dataState) {
			NotificationChain msgs = null;
			if (dataState != null)
				msgs = ((InternalEObject) dataState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, null, msgs);
			if (newDataState != null)
				msgs = ((InternalEObject) newDataState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE, null, msgs);
			msgs = basicSetDataState(newDataState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE,
					newDataState, newDataState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemDefinition getItemSubjectRef() {
		if (itemSubjectRef != null && itemSubjectRef.eIsProxy()) {
			InternalEObject oldItemSubjectRef = (InternalEObject) itemSubjectRef;
			itemSubjectRef = (ItemDefinition) eResolveProxy(oldItemSubjectRef);
			if (itemSubjectRef != oldItemSubjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef));
			}
		}
		return itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemSubjectRef() {
		return itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		ItemDefinition oldItemSubjectRef = itemSubjectRef;
		itemSubjectRef = newItemSubjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF,
					oldItemSubjectRef, itemSubjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataObject getDataObjectRef() {
		return dataObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataObjectRef(DataObject newDataObjectRef) {
		DataObject oldDataObjectRef = dataObjectRef;
		dataObjectRef = newDataObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF,
					oldDataObjectRef, dataObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
			return basicSetDataState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
			return getDataState();
		case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
			if (resolve)
				return getItemSubjectRef();
			return basicGetItemSubjectRef();
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
			return getDataObjectRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
			setDataState((DataState) newValue);
			return;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
			setItemSubjectRef((ItemDefinition) newValue);
			return;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
			setDataObjectRef((DataObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
			setDataState((DataState) null);
			return;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
			setItemSubjectRef((ItemDefinition) null);
			return;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
			setDataObjectRef((DataObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
			return dataState != null;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
			return itemSubjectRef != null;
		case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
			return dataObjectRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ItemAwareElement.class) {
			switch (derivedFeatureID) {
			case Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE:
				return Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE;
			case Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
				return Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ItemAwareElement.class) {
			switch (baseFeatureID) {
			case Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE:
				return Bpmn2Package.DATA_OBJECT_REFERENCE__DATA_STATE;
			case Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF:
				return Bpmn2Package.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataObjectReferenceImpl
