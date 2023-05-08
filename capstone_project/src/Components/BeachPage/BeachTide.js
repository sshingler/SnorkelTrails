import React from "react";

function BeachTide() {
  // Define the HTML code as a string
  const html = `
    <div id="tidewidget" style="padding:10px; width:200px; min-height:250px; border:1px solid #888888; background:#eeeeee; border-radius:4px;">
      <table style="border-collapse:collapse; width:100%; height:100%;">
        <thead>
          <tr>
            <th colspan="3" style="padding-bottom:10px; text-align:center; color:#333333; font:bold 14px sans-serif;">
              Mallaig Tide Times<br/><span style="font:bold 12px sans-serif;">Mon 8th May 2023</span>
            </th>
          </tr>
        </thead>
        <tr>
          <td style="font:bold 11px sans-serif; text-align:left;">Tide</td>
          <td style="font:bold 11px sans-serif; text-align:center;">Time</td>
          <td style="font:bold 11px sans-serif; text-align:right;">Height</td>
        </tr>
        <tr><td colspan="3"><hr style="margin:0px;"/></td></tr>
        <tr>
          <td style="font:normal 12px sans-serif; text-align:left;">Low</td>
          <td style="font:normal 16px sans-serif; text-align:center;">02:32</td>
          <td style="font:normal 12px sans-serif; text-align:right;">0.79m</td>
        </tr>
        <tr><td colspan="3"><hr style="margin:0px;"/></td></tr>
        <tr>
          <td style="font:normal 12px sans-serif; text-align:left;">High</td>
          <td style="font:normal 16px sans-serif; text-align:center;">08:16</td>
          <td style="font:normal 12px sans-serif; text-align:right;">4.73m</td>
        </tr>
        <tr><td colspan="3"><hr style="margin:0px;"/></td></tr>
        <tr>
          <td style="font:normal 12px sans-serif; text-align:left;">Low</td>
          <td style="font:normal 16px sans-serif; text-align:center;">14:52</td>
          <td style="font:normal 12px sans-serif; text-align:right;">0.96m</td>
        </tr>
        <tr><td colspan="3"><hr style="margin:0px;"/></td></tr>
        <tr>
          <td style="font:normal 12px sans-serif; text-align:left;">High</td>
          <td style="font:normal 16px sans-serif; text-align:center;">20:37</td>
          <td style="font:normal 12px sans-serif; text-align:right;">4.71m</td>
        </tr>
        <tr>
          <td colspan="3" style="padding-top:10px; color: black; font:normal 12px sans-serif; text-align:center;">
            <a style="color: black;" href="https://www.tidetimes.org.uk/mallaig-tide-times?from=widget" target="_blank">www.tidetimes.org.uk</a>
          </td>
        </tr>
      </table>
    </div>
  `;

  return <div dangerouslySetInnerHTML={{ __html: html }} />;
}

export default BeachTide;

