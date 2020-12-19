package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.model.api.ProfileCondition
import org.jellyfin.apiclient.model.api.ProfileConditionType
import org.jellyfin.apiclient.model.api.ProfileConditionValue

public infix fun <T> ProfileConditionValue.inList(value: Collection<T>): ProfileCondition = ProfileCondition(
	property = this,
	condition = ProfileConditionType.EQUALS_ANY,
	value = value.toString(),
	isRequired = true
)

public infix fun <T> ProfileConditionValue.eq(value: T): ProfileCondition = ProfileCondition(
	property = this,
	condition = ProfileConditionType.EQUALS,
	value = value.toString(),
	isRequired = true
)

public infix fun <T> ProfileConditionValue.neq(value: T): ProfileCondition = ProfileCondition(
	property = this,
	condition = ProfileConditionType.NOT_EQUALS,
	value = value.toString(),
	isRequired = true
)

public infix fun <T> ProfileConditionValue.lessEq(value: T): ProfileCondition = ProfileCondition(
	property = this,
	condition = ProfileConditionType.LESS_THAN_EQUAL,
	value = value.toString(),
	isRequired = true
)

public infix fun <T> ProfileConditionValue.greaterEq(value: T): ProfileCondition = ProfileCondition(
	property = this,
	condition = ProfileConditionType.GREATER_THAN_EQUAL,
	value = value.toString(),
	isRequired = true
)
