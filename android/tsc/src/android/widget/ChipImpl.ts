// start - imports

export const enum TextView_ellipsize {
end = "end",
middle = "middle",
none = "none",
start = "start",
}	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';
import { Mixin, decorate } from 'ts-mixer';





































// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class ChipImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkable" }))
	checkable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAppearance" }))
	textAppearance!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkedIcon" }))
	checkedIcon!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkedIconTint" }))
	checkedIconTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkedIconVisible" }))
	checkedIconVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipBackgroundColor" }))
	chipBackgroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipCornerRadius" }))
	chipCornerRadius!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipEndPadding" }))
	chipEndPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipIcon" }))
	chipIcon!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipIconSize" }))
	chipIconSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipIconTint" }))
	chipIconTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipIconVisible" }))
	chipIconVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipMinHeight" }))
	chipMinHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipStartPadding" }))
	chipStartPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipStrokeColor" }))
	chipStrokeColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipStrokeWidth" }))
	chipStrokeWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIcon" }))
	closeIcon!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIconEndPadding" }))
	closeIconEndPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIconSize" }))
	closeIconSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIconStartPadding" }))
	closeIconStartPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIconTint" }))
	closeIconTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "closeIconVisible" }))
	closeIconVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "ensureMinTouchTargetSize" }))
	ensureMinTouchTargetSize!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iconEndPadding" }))
	iconEndPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iconStartPadding" }))
	iconStartPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "rippleColor" }))
	rippleColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textEndPadding" }))
	textEndPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textStartPadding" }))
	textStartPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "ellipsize" }))
	ellipsize!:CommandAttr<TextView_ellipsize>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxWidth" }))
	maxWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checked" }))
	checked!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "text" }))
	text!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onCheckedChange" }))
	onCheckedChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onCloseIconClick" }))
	onCloseIconClick!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.checkable = undefined;
		this.textAppearance = undefined;
		this.checkedIcon = undefined;
		this.checkedIconTint = undefined;
		this.checkedIconVisible = undefined;
		this.chipBackgroundColor = undefined;
		this.chipCornerRadius = undefined;
		this.chipEndPadding = undefined;
		this.chipIcon = undefined;
		this.chipIconSize = undefined;
		this.chipIconTint = undefined;
		this.chipIconVisible = undefined;
		this.chipMinHeight = undefined;
		this.chipStartPadding = undefined;
		this.chipStrokeColor = undefined;
		this.chipStrokeWidth = undefined;
		this.closeIcon = undefined;
		this.closeIconEndPadding = undefined;
		this.closeIconSize = undefined;
		this.closeIconStartPadding = undefined;
		this.closeIconTint = undefined;
		this.closeIconVisible = undefined;
		this.ensureMinTouchTargetSize = undefined;
		this.iconEndPadding = undefined;
		this.iconStartPadding = undefined;
		this.rippleColor = undefined;
		this.textEndPadding = undefined;
		this.textStartPadding = undefined;
		this.ellipsize = undefined;
		this.maxWidth = undefined;
		this.checked = undefined;
		this.text = undefined;
		this.onCheckedChange = undefined;
		this.onCloseIconClick = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setCheckable(value : boolean) : T {
		this.resetIfRequired();
		if (this.checkable == null || this.checkable == undefined) {
			this.checkable = new CommandAttr<boolean>();
		}
		
		this.checkable.setSetter(true);
		this.checkable.setValue(value);
		this.orderSet++;
		this.checkable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.textAppearance == null || this.textAppearance == undefined) {
			this.textAppearance = new CommandAttr<string>();
		}
		
		this.textAppearance.setSetter(true);
		this.textAppearance.setValue(value);
		this.orderSet++;
		this.textAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCheckedIcon() : T {
		this.resetIfRequired();
		if (this.checkedIcon == null || this.checkedIcon == undefined) {
			this.checkedIcon = new CommandAttr<string>()
		}
		
		this.checkedIcon.setGetter(true);
		this.orderGet++;
		this.checkedIcon.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCheckedIcon() : string {
		if (this.checkedIcon == null || this.checkedIcon == undefined) {
			this.checkedIcon = new CommandAttr<string>();
		}
		return this.checkedIcon.getCommandReturnValue();
	}
	public setCheckedIcon(value : string) : T {
		this.resetIfRequired();
		if (this.checkedIcon == null || this.checkedIcon == undefined) {
			this.checkedIcon = new CommandAttr<string>();
		}
		
		this.checkedIcon.setSetter(true);
		this.checkedIcon.setValue(value);
		this.orderSet++;
		this.checkedIcon.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCheckedIconTint() : T {
		this.resetIfRequired();
		if (this.checkedIconTint == null || this.checkedIconTint == undefined) {
			this.checkedIconTint = new CommandAttr<string>()
		}
		
		this.checkedIconTint.setGetter(true);
		this.orderGet++;
		this.checkedIconTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCheckedIconTint() : string {
		if (this.checkedIconTint == null || this.checkedIconTint == undefined) {
			this.checkedIconTint = new CommandAttr<string>();
		}
		return this.checkedIconTint.getCommandReturnValue();
	}
	public setCheckedIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.checkedIconTint == null || this.checkedIconTint == undefined) {
			this.checkedIconTint = new CommandAttr<string>();
		}
		
		this.checkedIconTint.setSetter(true);
		this.checkedIconTint.setValue(value);
		this.orderSet++;
		this.checkedIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCheckedIconVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.checkedIconVisible == null || this.checkedIconVisible == undefined) {
			this.checkedIconVisible = new CommandAttr<boolean>();
		}
		
		this.checkedIconVisible.setSetter(true);
		this.checkedIconVisible.setValue(value);
		this.orderSet++;
		this.checkedIconVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipBackgroundColor() : T {
		this.resetIfRequired();
		if (this.chipBackgroundColor == null || this.chipBackgroundColor == undefined) {
			this.chipBackgroundColor = new CommandAttr<string>()
		}
		
		this.chipBackgroundColor.setGetter(true);
		this.orderGet++;
		this.chipBackgroundColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipBackgroundColor() : string {
		if (this.chipBackgroundColor == null || this.chipBackgroundColor == undefined) {
			this.chipBackgroundColor = new CommandAttr<string>();
		}
		return this.chipBackgroundColor.getCommandReturnValue();
	}
	public setChipBackgroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.chipBackgroundColor == null || this.chipBackgroundColor == undefined) {
			this.chipBackgroundColor = new CommandAttr<string>();
		}
		
		this.chipBackgroundColor.setSetter(true);
		this.chipBackgroundColor.setValue(value);
		this.orderSet++;
		this.chipBackgroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipCornerRadius() : T {
		this.resetIfRequired();
		if (this.chipCornerRadius == null || this.chipCornerRadius == undefined) {
			this.chipCornerRadius = new CommandAttr<string>()
		}
		
		this.chipCornerRadius.setGetter(true);
		this.orderGet++;
		this.chipCornerRadius.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipCornerRadius() : string {
		if (this.chipCornerRadius == null || this.chipCornerRadius == undefined) {
			this.chipCornerRadius = new CommandAttr<string>();
		}
		return this.chipCornerRadius.getCommandReturnValue();
	}
	public setChipCornerRadius(value : string) : T {
		this.resetIfRequired();
		if (this.chipCornerRadius == null || this.chipCornerRadius == undefined) {
			this.chipCornerRadius = new CommandAttr<string>();
		}
		
		this.chipCornerRadius.setSetter(true);
		this.chipCornerRadius.setValue(value);
		this.orderSet++;
		this.chipCornerRadius.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipEndPadding() : T {
		this.resetIfRequired();
		if (this.chipEndPadding == null || this.chipEndPadding == undefined) {
			this.chipEndPadding = new CommandAttr<string>()
		}
		
		this.chipEndPadding.setGetter(true);
		this.orderGet++;
		this.chipEndPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipEndPadding() : string {
		if (this.chipEndPadding == null || this.chipEndPadding == undefined) {
			this.chipEndPadding = new CommandAttr<string>();
		}
		return this.chipEndPadding.getCommandReturnValue();
	}
	public setChipEndPadding(value : string) : T {
		this.resetIfRequired();
		if (this.chipEndPadding == null || this.chipEndPadding == undefined) {
			this.chipEndPadding = new CommandAttr<string>();
		}
		
		this.chipEndPadding.setSetter(true);
		this.chipEndPadding.setValue(value);
		this.orderSet++;
		this.chipEndPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipIcon() : T {
		this.resetIfRequired();
		if (this.chipIcon == null || this.chipIcon == undefined) {
			this.chipIcon = new CommandAttr<string>()
		}
		
		this.chipIcon.setGetter(true);
		this.orderGet++;
		this.chipIcon.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipIcon() : string {
		if (this.chipIcon == null || this.chipIcon == undefined) {
			this.chipIcon = new CommandAttr<string>();
		}
		return this.chipIcon.getCommandReturnValue();
	}
	public setChipIcon(value : string) : T {
		this.resetIfRequired();
		if (this.chipIcon == null || this.chipIcon == undefined) {
			this.chipIcon = new CommandAttr<string>();
		}
		
		this.chipIcon.setSetter(true);
		this.chipIcon.setValue(value);
		this.orderSet++;
		this.chipIcon.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChipIconSize(value : string) : T {
		this.resetIfRequired();
		if (this.chipIconSize == null || this.chipIconSize == undefined) {
			this.chipIconSize = new CommandAttr<string>();
		}
		
		this.chipIconSize.setSetter(true);
		this.chipIconSize.setValue(value);
		this.orderSet++;
		this.chipIconSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipIconTint() : T {
		this.resetIfRequired();
		if (this.chipIconTint == null || this.chipIconTint == undefined) {
			this.chipIconTint = new CommandAttr<string>()
		}
		
		this.chipIconTint.setGetter(true);
		this.orderGet++;
		this.chipIconTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipIconTint() : string {
		if (this.chipIconTint == null || this.chipIconTint == undefined) {
			this.chipIconTint = new CommandAttr<string>();
		}
		return this.chipIconTint.getCommandReturnValue();
	}
	public setChipIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.chipIconTint == null || this.chipIconTint == undefined) {
			this.chipIconTint = new CommandAttr<string>();
		}
		
		this.chipIconTint.setSetter(true);
		this.chipIconTint.setValue(value);
		this.orderSet++;
		this.chipIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChipIconVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.chipIconVisible == null || this.chipIconVisible == undefined) {
			this.chipIconVisible = new CommandAttr<boolean>();
		}
		
		this.chipIconVisible.setSetter(true);
		this.chipIconVisible.setValue(value);
		this.orderSet++;
		this.chipIconVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipMinHeight() : T {
		this.resetIfRequired();
		if (this.chipMinHeight == null || this.chipMinHeight == undefined) {
			this.chipMinHeight = new CommandAttr<string>()
		}
		
		this.chipMinHeight.setGetter(true);
		this.orderGet++;
		this.chipMinHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipMinHeight() : string {
		if (this.chipMinHeight == null || this.chipMinHeight == undefined) {
			this.chipMinHeight = new CommandAttr<string>();
		}
		return this.chipMinHeight.getCommandReturnValue();
	}
	public setChipMinHeight(value : string) : T {
		this.resetIfRequired();
		if (this.chipMinHeight == null || this.chipMinHeight == undefined) {
			this.chipMinHeight = new CommandAttr<string>();
		}
		
		this.chipMinHeight.setSetter(true);
		this.chipMinHeight.setValue(value);
		this.orderSet++;
		this.chipMinHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipStartPadding() : T {
		this.resetIfRequired();
		if (this.chipStartPadding == null || this.chipStartPadding == undefined) {
			this.chipStartPadding = new CommandAttr<string>()
		}
		
		this.chipStartPadding.setGetter(true);
		this.orderGet++;
		this.chipStartPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipStartPadding() : string {
		if (this.chipStartPadding == null || this.chipStartPadding == undefined) {
			this.chipStartPadding = new CommandAttr<string>();
		}
		return this.chipStartPadding.getCommandReturnValue();
	}
	public setChipStartPadding(value : string) : T {
		this.resetIfRequired();
		if (this.chipStartPadding == null || this.chipStartPadding == undefined) {
			this.chipStartPadding = new CommandAttr<string>();
		}
		
		this.chipStartPadding.setSetter(true);
		this.chipStartPadding.setValue(value);
		this.orderSet++;
		this.chipStartPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipStrokeColor() : T {
		this.resetIfRequired();
		if (this.chipStrokeColor == null || this.chipStrokeColor == undefined) {
			this.chipStrokeColor = new CommandAttr<string>()
		}
		
		this.chipStrokeColor.setGetter(true);
		this.orderGet++;
		this.chipStrokeColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipStrokeColor() : string {
		if (this.chipStrokeColor == null || this.chipStrokeColor == undefined) {
			this.chipStrokeColor = new CommandAttr<string>();
		}
		return this.chipStrokeColor.getCommandReturnValue();
	}
	public setChipStrokeColor(value : string) : T {
		this.resetIfRequired();
		if (this.chipStrokeColor == null || this.chipStrokeColor == undefined) {
			this.chipStrokeColor = new CommandAttr<string>();
		}
		
		this.chipStrokeColor.setSetter(true);
		this.chipStrokeColor.setValue(value);
		this.orderSet++;
		this.chipStrokeColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChipStrokeWidth() : T {
		this.resetIfRequired();
		if (this.chipStrokeWidth == null || this.chipStrokeWidth == undefined) {
			this.chipStrokeWidth = new CommandAttr<string>()
		}
		
		this.chipStrokeWidth.setGetter(true);
		this.orderGet++;
		this.chipStrokeWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChipStrokeWidth() : string {
		if (this.chipStrokeWidth == null || this.chipStrokeWidth == undefined) {
			this.chipStrokeWidth = new CommandAttr<string>();
		}
		return this.chipStrokeWidth.getCommandReturnValue();
	}
	public setChipStrokeWidth(value : string) : T {
		this.resetIfRequired();
		if (this.chipStrokeWidth == null || this.chipStrokeWidth == undefined) {
			this.chipStrokeWidth = new CommandAttr<string>();
		}
		
		this.chipStrokeWidth.setSetter(true);
		this.chipStrokeWidth.setValue(value);
		this.orderSet++;
		this.chipStrokeWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCloseIcon() : T {
		this.resetIfRequired();
		if (this.closeIcon == null || this.closeIcon == undefined) {
			this.closeIcon = new CommandAttr<string>()
		}
		
		this.closeIcon.setGetter(true);
		this.orderGet++;
		this.closeIcon.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCloseIcon() : string {
		if (this.closeIcon == null || this.closeIcon == undefined) {
			this.closeIcon = new CommandAttr<string>();
		}
		return this.closeIcon.getCommandReturnValue();
	}
	public setCloseIcon(value : string) : T {
		this.resetIfRequired();
		if (this.closeIcon == null || this.closeIcon == undefined) {
			this.closeIcon = new CommandAttr<string>();
		}
		
		this.closeIcon.setSetter(true);
		this.closeIcon.setValue(value);
		this.orderSet++;
		this.closeIcon.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCloseIconEndPadding() : T {
		this.resetIfRequired();
		if (this.closeIconEndPadding == null || this.closeIconEndPadding == undefined) {
			this.closeIconEndPadding = new CommandAttr<string>()
		}
		
		this.closeIconEndPadding.setGetter(true);
		this.orderGet++;
		this.closeIconEndPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCloseIconEndPadding() : string {
		if (this.closeIconEndPadding == null || this.closeIconEndPadding == undefined) {
			this.closeIconEndPadding = new CommandAttr<string>();
		}
		return this.closeIconEndPadding.getCommandReturnValue();
	}
	public setCloseIconEndPadding(value : string) : T {
		this.resetIfRequired();
		if (this.closeIconEndPadding == null || this.closeIconEndPadding == undefined) {
			this.closeIconEndPadding = new CommandAttr<string>();
		}
		
		this.closeIconEndPadding.setSetter(true);
		this.closeIconEndPadding.setValue(value);
		this.orderSet++;
		this.closeIconEndPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCloseIconSize() : T {
		this.resetIfRequired();
		if (this.closeIconSize == null || this.closeIconSize == undefined) {
			this.closeIconSize = new CommandAttr<string>()
		}
		
		this.closeIconSize.setGetter(true);
		this.orderGet++;
		this.closeIconSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCloseIconSize() : string {
		if (this.closeIconSize == null || this.closeIconSize == undefined) {
			this.closeIconSize = new CommandAttr<string>();
		}
		return this.closeIconSize.getCommandReturnValue();
	}
	public setCloseIconSize(value : string) : T {
		this.resetIfRequired();
		if (this.closeIconSize == null || this.closeIconSize == undefined) {
			this.closeIconSize = new CommandAttr<string>();
		}
		
		this.closeIconSize.setSetter(true);
		this.closeIconSize.setValue(value);
		this.orderSet++;
		this.closeIconSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCloseIconStartPadding() : T {
		this.resetIfRequired();
		if (this.closeIconStartPadding == null || this.closeIconStartPadding == undefined) {
			this.closeIconStartPadding = new CommandAttr<string>()
		}
		
		this.closeIconStartPadding.setGetter(true);
		this.orderGet++;
		this.closeIconStartPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCloseIconStartPadding() : string {
		if (this.closeIconStartPadding == null || this.closeIconStartPadding == undefined) {
			this.closeIconStartPadding = new CommandAttr<string>();
		}
		return this.closeIconStartPadding.getCommandReturnValue();
	}
	public setCloseIconStartPadding(value : string) : T {
		this.resetIfRequired();
		if (this.closeIconStartPadding == null || this.closeIconStartPadding == undefined) {
			this.closeIconStartPadding = new CommandAttr<string>();
		}
		
		this.closeIconStartPadding.setSetter(true);
		this.closeIconStartPadding.setValue(value);
		this.orderSet++;
		this.closeIconStartPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCloseIconTint() : T {
		this.resetIfRequired();
		if (this.closeIconTint == null || this.closeIconTint == undefined) {
			this.closeIconTint = new CommandAttr<string>()
		}
		
		this.closeIconTint.setGetter(true);
		this.orderGet++;
		this.closeIconTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCloseIconTint() : string {
		if (this.closeIconTint == null || this.closeIconTint == undefined) {
			this.closeIconTint = new CommandAttr<string>();
		}
		return this.closeIconTint.getCommandReturnValue();
	}
	public setCloseIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.closeIconTint == null || this.closeIconTint == undefined) {
			this.closeIconTint = new CommandAttr<string>();
		}
		
		this.closeIconTint.setSetter(true);
		this.closeIconTint.setValue(value);
		this.orderSet++;
		this.closeIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCloseIconVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.closeIconVisible == null || this.closeIconVisible == undefined) {
			this.closeIconVisible = new CommandAttr<boolean>();
		}
		
		this.closeIconVisible.setSetter(true);
		this.closeIconVisible.setValue(value);
		this.orderSet++;
		this.closeIconVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetEnsureMinTouchTargetSize() : T {
		this.resetIfRequired();
		if (this.ensureMinTouchTargetSize == null || this.ensureMinTouchTargetSize == undefined) {
			this.ensureMinTouchTargetSize = new CommandAttr<boolean>()
		}
		
		this.ensureMinTouchTargetSize.setGetter(true);
		this.orderGet++;
		this.ensureMinTouchTargetSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isEnsureMinTouchTargetSize() : boolean {
		if (this.ensureMinTouchTargetSize == null || this.ensureMinTouchTargetSize == undefined) {
			this.ensureMinTouchTargetSize = new CommandAttr<boolean>();
		}
		return this.ensureMinTouchTargetSize.getCommandReturnValue();
	}
	public setEnsureMinTouchTargetSize(value : boolean) : T {
		this.resetIfRequired();
		if (this.ensureMinTouchTargetSize == null || this.ensureMinTouchTargetSize == undefined) {
			this.ensureMinTouchTargetSize = new CommandAttr<boolean>();
		}
		
		this.ensureMinTouchTargetSize.setSetter(true);
		this.ensureMinTouchTargetSize.setValue(value);
		this.orderSet++;
		this.ensureMinTouchTargetSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIconEndPadding() : T {
		this.resetIfRequired();
		if (this.iconEndPadding == null || this.iconEndPadding == undefined) {
			this.iconEndPadding = new CommandAttr<string>()
		}
		
		this.iconEndPadding.setGetter(true);
		this.orderGet++;
		this.iconEndPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIconEndPadding() : string {
		if (this.iconEndPadding == null || this.iconEndPadding == undefined) {
			this.iconEndPadding = new CommandAttr<string>();
		}
		return this.iconEndPadding.getCommandReturnValue();
	}
	public setIconEndPadding(value : string) : T {
		this.resetIfRequired();
		if (this.iconEndPadding == null || this.iconEndPadding == undefined) {
			this.iconEndPadding = new CommandAttr<string>();
		}
		
		this.iconEndPadding.setSetter(true);
		this.iconEndPadding.setValue(value);
		this.orderSet++;
		this.iconEndPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIconStartPadding() : T {
		this.resetIfRequired();
		if (this.iconStartPadding == null || this.iconStartPadding == undefined) {
			this.iconStartPadding = new CommandAttr<string>()
		}
		
		this.iconStartPadding.setGetter(true);
		this.orderGet++;
		this.iconStartPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIconStartPadding() : string {
		if (this.iconStartPadding == null || this.iconStartPadding == undefined) {
			this.iconStartPadding = new CommandAttr<string>();
		}
		return this.iconStartPadding.getCommandReturnValue();
	}
	public setIconStartPadding(value : string) : T {
		this.resetIfRequired();
		if (this.iconStartPadding == null || this.iconStartPadding == undefined) {
			this.iconStartPadding = new CommandAttr<string>();
		}
		
		this.iconStartPadding.setSetter(true);
		this.iconStartPadding.setValue(value);
		this.orderSet++;
		this.iconStartPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetRippleColor() : T {
		this.resetIfRequired();
		if (this.rippleColor == null || this.rippleColor == undefined) {
			this.rippleColor = new CommandAttr<string>()
		}
		
		this.rippleColor.setGetter(true);
		this.orderGet++;
		this.rippleColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getRippleColor() : string {
		if (this.rippleColor == null || this.rippleColor == undefined) {
			this.rippleColor = new CommandAttr<string>();
		}
		return this.rippleColor.getCommandReturnValue();
	}
	public setRippleColor(value : string) : T {
		this.resetIfRequired();
		if (this.rippleColor == null || this.rippleColor == undefined) {
			this.rippleColor = new CommandAttr<string>();
		}
		
		this.rippleColor.setSetter(true);
		this.rippleColor.setValue(value);
		this.orderSet++;
		this.rippleColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextEndPadding() : T {
		this.resetIfRequired();
		if (this.textEndPadding == null || this.textEndPadding == undefined) {
			this.textEndPadding = new CommandAttr<string>()
		}
		
		this.textEndPadding.setGetter(true);
		this.orderGet++;
		this.textEndPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextEndPadding() : string {
		if (this.textEndPadding == null || this.textEndPadding == undefined) {
			this.textEndPadding = new CommandAttr<string>();
		}
		return this.textEndPadding.getCommandReturnValue();
	}
	public setTextEndPadding(value : string) : T {
		this.resetIfRequired();
		if (this.textEndPadding == null || this.textEndPadding == undefined) {
			this.textEndPadding = new CommandAttr<string>();
		}
		
		this.textEndPadding.setSetter(true);
		this.textEndPadding.setValue(value);
		this.orderSet++;
		this.textEndPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextStartPadding() : T {
		this.resetIfRequired();
		if (this.textStartPadding == null || this.textStartPadding == undefined) {
			this.textStartPadding = new CommandAttr<string>()
		}
		
		this.textStartPadding.setGetter(true);
		this.orderGet++;
		this.textStartPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextStartPadding() : string {
		if (this.textStartPadding == null || this.textStartPadding == undefined) {
			this.textStartPadding = new CommandAttr<string>();
		}
		return this.textStartPadding.getCommandReturnValue();
	}
	public setTextStartPadding(value : string) : T {
		this.resetIfRequired();
		if (this.textStartPadding == null || this.textStartPadding == undefined) {
			this.textStartPadding = new CommandAttr<string>();
		}
		
		this.textStartPadding.setSetter(true);
		this.textStartPadding.setValue(value);
		this.orderSet++;
		this.textStartPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEllipsize(value : TextView_ellipsize) : T {
		this.resetIfRequired();
		if (this.ellipsize == null || this.ellipsize == undefined) {
			this.ellipsize = new CommandAttr<TextView_ellipsize>();
		}
		
		this.ellipsize.setSetter(true);
		this.ellipsize.setValue(value);
		this.orderSet++;
		this.ellipsize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setMaxWidth(value : string) : T {
		this.resetIfRequired();
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>();
		}
		
		this.maxWidth.setSetter(true);
		this.maxWidth.setValue(value);
		this.orderSet++;
		this.maxWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChecked(value : boolean) : T {
		this.resetIfRequired();
		if (this.checked == null || this.checked == undefined) {
			this.checked = new CommandAttr<boolean>();
		}
		
		this.checked.setSetter(true);
		this.checked.setValue(value);
		this.orderSet++;
		this.checked.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setText(value : string) : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		
		this.text.setSetter(true);
		this.text.setValue(value);
		this.orderSet++;
		this.text.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnCheckedChange(value : string) : T {
		this.resetIfRequired();
		if (this.onCheckedChange == null || this.onCheckedChange == undefined) {
			this.onCheckedChange = new CommandAttr<string>();
		}
		
		this.onCheckedChange.setSetter(true);
		this.onCheckedChange.setValue(value);
		this.orderSet++;
		this.onCheckedChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnCloseIconClick(value : string) : T {
		this.resetIfRequired();
		if (this.onCloseIconClick == null || this.onCloseIconClick == undefined) {
			this.onCloseIconClick = new CommandAttr<string>();
		}
		
		this.onCloseIconClick.setSetter(true);
		this.onCloseIconClick.setValue(value);
		this.orderSet++;
		this.onCloseIconClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class Chip extends ChipImpl<Chip> implements IWidget{
    getThisPointer(): Chip {
        return this;
    }
    
   	public getClass() {
		return Chip;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ChipImpl.initialize();

//end - staticinit
