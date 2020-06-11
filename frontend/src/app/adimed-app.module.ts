import {NgModule} from "@angular/core";
import {AdimedAppComponent} from "./adimed-app.component";
import {AppModule} from "path-framework/app/app.module";
import {OrderSummaryComponent} from "./custom-components/order-summary/order-summary-component";
import * as PlotlyJS from "plotly.js/dist/plotly.js";
import { PlotlyModule } from "angular-plotly.js";

PlotlyModule.plotlyjs = PlotlyJS;

@NgModule({
    imports:      [AppModule, PlotlyModule],
    declarations: [AdimedAppComponent, OrderSummaryComponent],
    bootstrap:    [AdimedAppComponent],
    entryComponents: [OrderSummaryComponent]
})
export class AdimedAppModule {}
