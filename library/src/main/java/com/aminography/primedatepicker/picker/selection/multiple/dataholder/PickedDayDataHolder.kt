package com.aminography.primedatepicker.picker.selection.multiple.dataholder

import com.aminography.primecalendar.PrimeCalendar
import com.aminography.primedatepicker.common.LabelFormatter
import com.aminography.primedatepicker.utils.localizeDigits

/**
 * @author aminography
 */
internal data class PickedDayDataHolder(
    override val id: String,
    val calendar: PrimeCalendar,
    private val topLabelFormatter: LabelFormatter?,
    private val bottomLabelFormatter: LabelFormatter?
) : BasePickedDayDataHolder(id) {

    val topLabel: String = topLabelFormatter?.invoke(calendar)?.localizeDigits(calendar.locale) ?: ""
    val bottomLabel: String = bottomLabelFormatter?.invoke(calendar)?.localizeDigits(calendar.locale) ?: ""

}