import React from 'react';

export const AppFooter = (props) => {

    return (
        <div className="layout-footer">
            <img src={props.layoutColorMode === 'light' ? 'assets/layout/images/logo-dark.svg' : 'assets/layout/images/logo-white.svg'} alt="Logo" height="20" className="mr-2" />
            by
            <span className="font-medium ml-2"> Copyright © 2022 Matheus Magalhães </span>
        </div>
    );
}
