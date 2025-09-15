// start - imports

	
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












export class ChipGroupImpl_addChip {
@decorate(Expose({ name: "chipId" }))
chipId!:string;
@decorate(Expose({ name: "text" }))
text!:string;
@decorate(Expose({ name: "chipParams" }))
chipParams!:string;
}

import {ViewGroupImpl_LayoutParams} from './ViewGroupImpl';

// end - imports
import {ViewGroupImpl} from './ViewGroupImpl';
export abstract class ChipGroupImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkedChip" }))
	checkedChip!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "uncheckedChip" }))
	uncheckedChip!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "clearCheck" }))
	clearCheck_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checkMultiple" }))
	checkMultiple_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectionRequired" }))
	selectionRequired!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onCheckedStateChange" }))
	onCheckedStateChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipSpacing" }))
	chipSpacing!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipSpacingHorizontal" }))
	chipSpacingHorizontal!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "chipSpacingVertical" }))
	chipSpacingVertical!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleLine" }))
	singleLine!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleSelection" }))
	singleSelection!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "addChip" }))
	addChip_!:CommandAttr<ChipGroupImpl_addChip>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "removeChip" }))
	removeChip_!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.checkedChip = undefined;
		this.uncheckedChip = undefined;
		this.clearCheck_ = undefined;
		this.checkMultiple_ = undefined;
		this.selectionRequired = undefined;
		this.onCheckedStateChange = undefined;
		this.chipSpacing = undefined;
		this.chipSpacingHorizontal = undefined;
		this.chipSpacingVertical = undefined;
		this.singleLine = undefined;
		this.singleSelection = undefined;
		this.addChip_ = undefined;
		this.removeChip_ = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetCheckedChip() : T {
		this.resetIfRequired();
		if (this.checkedChip == null || this.checkedChip == undefined) {
			this.checkedChip = new CommandAttr<string>()
		}
		
		this.checkedChip.setGetter(true);
		this.orderGet++;
		this.checkedChip.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCheckedChip() : string {
		if (this.checkedChip == null || this.checkedChip == undefined) {
			this.checkedChip = new CommandAttr<string>();
		}
		return this.checkedChip.getCommandReturnValue();
	}
	public setCheckedChip(value : string) : T {
		this.resetIfRequired();
		if (this.checkedChip == null || this.checkedChip == undefined) {
			this.checkedChip = new CommandAttr<string>();
		}
		
		this.checkedChip.setSetter(true);
		this.checkedChip.setValue(value);
		this.orderSet++;
		this.checkedChip.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setUncheckedChip(value : string) : T {
		this.resetIfRequired();
		if (this.uncheckedChip == null || this.uncheckedChip == undefined) {
			this.uncheckedChip = new CommandAttr<string>();
		}
		
		this.uncheckedChip.setSetter(true);
		this.uncheckedChip.setValue(value);
		this.orderSet++;
		this.uncheckedChip.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public clearCheck() : T {
		this.resetIfRequired();
		if (this.clearCheck_ == null || this.clearCheck_ == undefined) {
			this.clearCheck_ = new CommandAttr<void>();
		}
		
		this.clearCheck_.setSetter(true);
		
		this.orderSet++;
		this.clearCheck_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCheckMultiple() : T {
		this.resetIfRequired();
		if (this.checkMultiple_ == null || this.checkMultiple_ == undefined) {
			this.checkMultiple_ = new CommandAttr<string>()
		}
		
		this.checkMultiple_.setGetter(true);
		this.orderGet++;
		this.checkMultiple_.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCheckMultiple() : string {
		if (this.checkMultiple_ == null || this.checkMultiple_ == undefined) {
			this.checkMultiple_ = new CommandAttr<string>();
		}
		return this.checkMultiple_.getCommandReturnValue();
	}
	public checkMultiple(value : string) : T {
		this.resetIfRequired();
		if (this.checkMultiple_ == null || this.checkMultiple_ == undefined) {
			this.checkMultiple_ = new CommandAttr<string>();
		}
		
		this.checkMultiple_.setSetter(true);
		this.checkMultiple_.setValue(value);
		this.orderSet++;
		this.checkMultiple_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSelectionRequired(value : boolean) : T {
		this.resetIfRequired();
		if (this.selectionRequired == null || this.selectionRequired == undefined) {
			this.selectionRequired = new CommandAttr<boolean>();
		}
		
		this.selectionRequired.setSetter(true);
		this.selectionRequired.setValue(value);
		this.orderSet++;
		this.selectionRequired.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnCheckedStateChange(value : string) : T {
		this.resetIfRequired();
		if (this.onCheckedStateChange == null || this.onCheckedStateChange == undefined) {
			this.onCheckedStateChange = new CommandAttr<string>();
		}
		
		this.onCheckedStateChange.setSetter(true);
		this.onCheckedStateChange.setValue(value);
		this.orderSet++;
		this.onCheckedStateChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChipSpacing(value : string) : T {
		this.resetIfRequired();
		if (this.chipSpacing == null || this.chipSpacing == undefined) {
			this.chipSpacing = new CommandAttr<string>();
		}
		
		this.chipSpacing.setSetter(true);
		this.chipSpacing.setValue(value);
		this.orderSet++;
		this.chipSpacing.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChipSpacingHorizontal(value : string) : T {
		this.resetIfRequired();
		if (this.chipSpacingHorizontal == null || this.chipSpacingHorizontal == undefined) {
			this.chipSpacingHorizontal = new CommandAttr<string>();
		}
		
		this.chipSpacingHorizontal.setSetter(true);
		this.chipSpacingHorizontal.setValue(value);
		this.orderSet++;
		this.chipSpacingHorizontal.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setChipSpacingVertical(value : string) : T {
		this.resetIfRequired();
		if (this.chipSpacingVertical == null || this.chipSpacingVertical == undefined) {
			this.chipSpacingVertical = new CommandAttr<string>();
		}
		
		this.chipSpacingVertical.setSetter(true);
		this.chipSpacingVertical.setValue(value);
		this.orderSet++;
		this.chipSpacingVertical.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSingleLine(value : boolean) : T {
		this.resetIfRequired();
		if (this.singleLine == null || this.singleLine == undefined) {
			this.singleLine = new CommandAttr<boolean>();
		}
		
		this.singleLine.setSetter(true);
		this.singleLine.setValue(value);
		this.orderSet++;
		this.singleLine.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSingleSelection(value : boolean) : T {
		this.resetIfRequired();
		if (this.singleSelection == null || this.singleSelection == undefined) {
			this.singleSelection = new CommandAttr<boolean>();
		}
		
		this.singleSelection.setSetter(true);
		this.singleSelection.setValue(value);
		this.orderSet++;
		this.singleSelection.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public addChip(chipId : string,
text : string,
chipParams : string) : T {
		this.resetIfRequired();
		if (this.addChip_ == null || this.addChip_ == undefined) {
			this.addChip_ = new CommandAttr<ChipGroupImpl_addChip>();
		}
		
		let wrapper:ChipGroupImpl_addChip = new ChipGroupImpl_addChip();
		wrapper.chipId = chipId;
		wrapper.text = text;
		wrapper.chipParams = chipParams;
		this.addChip_.setSetter(true);
		this.addChip_.setValue(wrapper);	
		this.orderSet++;
		this.addChip_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public removeChip(value : string) : T {
		this.resetIfRequired();
		if (this.removeChip_ == null || this.removeChip_ == undefined) {
			this.removeChip_ = new CommandAttr<string>();
		}
		
		this.removeChip_.setSetter(true);
		this.removeChip_.setValue(value);
		this.orderSet++;
		this.removeChip_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class ChipGroup extends ChipGroupImpl<ChipGroup> implements IWidget{
    getThisPointer(): ChipGroup {
        return this;
    }
    
   	public getClass() {
		return ChipGroup;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ChipGroupImpl.initialize();
export interface OnCheckedChangedEvent extends Event{
        //group:ChipGroup;

        //checkedIds:List<Integer>;


}

//end - staticinit
